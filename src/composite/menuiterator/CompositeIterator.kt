package composite.menuiterator

import java.util.*

class CompositeIterator(iterator: Iterator<MenuComponent?>?) : Iterator<MenuComponent?> {
    var stack: Stack<Iterator<MenuComponent?>?> = Stack()

    init {
        stack.push(iterator)
    }

    override fun next(): MenuComponent? {
        if (hasNext()) {
            val iterator = stack.peek()
            val component = iterator!!.next()
            if (component is Menu) stack.push(component.createIterator())
            return component
        } else {
            return null
        }
    }

    override fun hasNext(): Boolean {
        if (stack.empty()) {
            return false
        } else {
            val iterator = stack.peek()
            if (!iterator!!.hasNext()) {
                stack.pop()
                return hasNext()
            } else {
                return true
            }
        }
    }
    /*
	 * No longer needed as of Java 8
	 * 
	 * (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 *
	*/
//	override fun remove() {
//		throw  UnsupportedOperationException()
//	}

}


