package proxy.protectionProxy

/**
 * Created by kwanwoo on 2017. 11. 20..
 */
class OwnerProxy(private val person: PersonBean?) : PersonBean {
    @set:Throws(IllegalAccessException::class)
    override var name: String?
        get() = person?.name
        set(name) {
            person?.name = name
        }

    @set:Throws(IllegalAccessException::class)
    override var gender: String?
        get() = person?.gender
        set(gender) {
            person?.gender = gender
        }

    @set:Throws(IllegalAccessException::class)
    override var interests: String?
        get() = person?.interests
        set(interests) {
            person?.interests = interests
        }

    @set:Throws(IllegalAccessException::class)
    override var hotOrNotRating: Int
        get() = person!!.hotOrNotRating
        set(rating) {
            throw IllegalAccessException()
        }
}
