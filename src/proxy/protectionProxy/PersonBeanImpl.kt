package proxy.protectionProxy

class PersonBeanImpl : PersonBean {
    override var name: String? = null
    override var gender: String? = null
    override var interests: String? = null
    var rating: Int = 0
    var ratingCount: Int = 0

    override var hotOrNotRating: Int
        get() {
            if (ratingCount == 0) return 0
            return (rating / ratingCount)
        }
        set(rating) {
            this.rating += rating
            ratingCount++
        }
}
