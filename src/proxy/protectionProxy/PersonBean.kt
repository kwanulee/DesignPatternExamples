package proxy.protectionProxy

interface PersonBean {
    @set:Throws(IllegalAccessException::class)
    var name: String?

    @set:Throws(IllegalAccessException::class)
    var gender: String?

    @set:Throws(IllegalAccessException::class)
    var interests: String?

    @set:Throws(IllegalAccessException::class)
    var hotOrNotRating: Int
}
