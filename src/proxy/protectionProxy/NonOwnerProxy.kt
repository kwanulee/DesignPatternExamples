package proxy.protectionProxy

/**
 * Created by kwanwoo on 2017. 11. 20..
 */
class NonOwnerProxy(private val person: PersonBean?) : PersonBean {
    @set:Throws(IllegalAccessException::class)
    override var name: String?
        get() = person?.name
        set(name) {
            throw IllegalAccessException()
        }

    @set:Throws(IllegalAccessException::class)
    override var gender: String?
        get() = person?.gender
        set(gender) {
            throw IllegalAccessException()
        }

    @set:Throws(IllegalAccessException::class)
    override var interests: String?
        get() = person?.interests
        set(interests) {
            throw IllegalAccessException()
        }

    @set:Throws(IllegalAccessException::class)
    override var hotOrNotRating: Int
        get() = person!!.hotOrNotRating
        set(rating) {
            person!!.hotOrNotRating = rating
        }
}
