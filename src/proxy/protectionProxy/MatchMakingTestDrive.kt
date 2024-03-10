package proxy.protectionProxy

class MatchMakingTestDrive {
    var datingDB: HashMap<String?, PersonBean> = HashMap()

    init {
        initializeDatabase()
    }

    @Throws(IllegalAccessException::class)
    fun drive() {
        val joe = getPersonFromDatabase("Joe Javabean")
        val ownerProxy = getOwnerProxy(joe)
        println("Name is " + ownerProxy.name)

        ownerProxy.interests = "bowling, Go"

        println("Interests set from owner proxy")
        try {
            ownerProxy.hotOrNotRating = 10
        } catch (e: Exception) {
            println("Can't set rating from owner proxy")
        }
        println("Rating is " + ownerProxy.hotOrNotRating)

        val nonOwnerProxy = getNonOwnerProxy(joe)
        println("Name is " + nonOwnerProxy.name)
        try {
            nonOwnerProxy.interests = "bowling, Go"
        } catch (e: Exception) {
            println("Can't set interests from non owner proxy")
        }
        nonOwnerProxy.hotOrNotRating = 3
        println("Rating set from non owner proxy")
        println("Rating is " + nonOwnerProxy.hotOrNotRating)
    }

    fun getOwnerProxy(person: PersonBean?): PersonBean {
        return OwnerProxy(person)
    }

    fun getNonOwnerProxy(person: PersonBean?): PersonBean {
        return NonOwnerProxy(person)
    }

    fun getPersonFromDatabase(name: String?): PersonBean? {
        return datingDB[name]
    }

    @Throws(IllegalAccessException::class)
    fun initializeDatabase() {
        val joe: PersonBean = PersonBeanImpl()
        joe.name = "Joe Javabean"
        joe.interests = "cars, computers, music"
        joe.hotOrNotRating = 7
        datingDB[joe.name] = joe

        val kelly: PersonBean = PersonBeanImpl()
        kelly.name = "Kelly Klosure"
        kelly.interests = "ebay, movies, music"
        kelly.hotOrNotRating = 6
        datingDB[kelly.name] = kelly
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            try {
                val test = MatchMakingTestDrive()
                test.drive()
            } catch (e: IllegalAccessException) {
                e.printStackTrace()
            }
        }
    }
}
