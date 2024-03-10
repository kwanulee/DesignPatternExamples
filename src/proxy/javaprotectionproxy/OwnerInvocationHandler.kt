package proxy.javaprotectionproxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method

class OwnerInvocationHandler(var person: PersonBean) : InvocationHandler {
    @Throws(IllegalAccessException::class)
    override fun invoke(proxy: Any, method: Method, args: Array<Any>): Any? {
        try {
            if (method.name.startsWith("get")) {
                return method.invoke(person, *args)
            } else if (method.name == "setHotOrNotRating") {
                throw IllegalAccessException()
            } else if (method.name.startsWith("set")) {
                return method.invoke(person, *args)
            }
        } catch (e: InvocationTargetException) {
            e.printStackTrace()
        }
        return null
    }
}
