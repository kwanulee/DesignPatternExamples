package composite.menuiterator

class NullIterator : Iterator<MenuComponent?> {
    override fun next(): MenuComponent? {
        return null
    }

    override fun hasNext(): Boolean {
        return false
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
