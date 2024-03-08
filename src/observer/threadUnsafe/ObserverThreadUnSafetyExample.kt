package observer.threadUnsafe

import java.util.*

class ConcreteSubject : Observable() {
    var state: Int = 0
        set(state) {
            field = state
            setChanged() // 상태 변경 여부를 알림
            notifyObservers() // 옵저버들에게 알림
        }
}

class ConcreteObserver : Observer {
    override fun update(o: Observable, arg: Any?) {
        val subject = o as ConcreteSubject
        println("Subject의 상태가 변경되었습니다. 새로운 상태: " + subject.state)
        try {
            Thread.sleep(1000) // 잠시 대기
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
}


fun main(args: Array<String>) {
    val subject = ConcreteSubject()
    val observer1 = ConcreteObserver()
    val observer2 = ConcreteObserver()

    // 옵저버 등록
    subject.addObserver(observer1)
    subject.addObserver(observer2)


    // 주제의 상태 변경
    for (i in 0..2) {
        val temp = i
        Thread {
            subject.state = temp
        }.start()
    }
}
