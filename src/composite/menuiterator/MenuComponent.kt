package composite.menuiterator

abstract class MenuComponent {
    open fun add(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun remove(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun getChild(i: Int): MenuComponent {
        throw UnsupportedOperationException()
    }

    open val name: String
        get() {
            throw UnsupportedOperationException()
        }
    open val description: String
        get() {
            throw UnsupportedOperationException()
        }
    open val price: Double
        get() {
            throw UnsupportedOperationException()
        }
    open val isVegetarian: Boolean
        get() {
            throw UnsupportedOperationException()
        }

    abstract fun createIterator(): Iterator<MenuComponent?>

    open fun print() {
        throw UnsupportedOperationException()
    }
}
