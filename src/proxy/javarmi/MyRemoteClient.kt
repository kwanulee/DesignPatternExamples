package proxy.javarmi

import java.rmi.Naming

class MyRemoteClient {
    fun go() {
        try {
            val service = Naming.lookup("rmi://localhost/RemoteHello") as MyRemote
            val s = service.sayHello()
            println(s)
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}

fun main(args: Array<String>) {
    MyRemoteClient().go()
}

