package proxy.javaprotectionproxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method

class NonOwnerInvocationHandler(var person: PersonBean) : InvocationHandler {
    @Throws(IllegalAccessException::class)
    override fun invoke(proxy: Any, method: Method, args: Array<Any>): Any? {
        try {
            if (method.name.startsWith("get")) {
                return method.invoke(person, *args)
            } else if (method.name == "setHotOrNotRating") {
                return method.invoke(person, *args)
            } else if (method.name.startsWith("set")) {
                throw IllegalAccessException()
            }
        } catch (e: InvocationTargetException) {
            e.printStackTrace()
        }
        return null
    }
}
