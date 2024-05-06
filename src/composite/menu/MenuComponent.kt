package composite.menu

abstract class MenuComponent {
    open fun  getName(): String {
        throw UnsupportedOperationException()
    }
    open fun getDescription(): String {
        throw UnsupportedOperationException()
    }
    open fun getPrice() : Double {
        throw UnsupportedOperationException()
    }
    open fun isVegetarian() : Boolean {
        throw UnsupportedOperationException()
    }
    open fun print() {
        throw UnsupportedOperationException()
    }
    open fun add(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }
    open fun remove(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }
    open fun getChild(i: Int): MenuComponent {
        throw UnsupportedOperationException()
    }
}
