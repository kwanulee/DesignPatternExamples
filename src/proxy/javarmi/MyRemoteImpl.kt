package proxy.javarmi

import java.rmi.Naming
import java.rmi.RemoteException
import java.rmi.server.UnicastRemoteObject

class MyRemoteImpl protected constructor() : UnicastRemoteObject(), MyRemote {
    @Throws(RemoteException::class)
    override fun sayHello(): String {
        return "Server says, 'Hey'"
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            try {
                val service: MyRemote = MyRemoteImpl()
                Naming.rebind("RemoteHello", service)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
