package observer.threadSafe

interface Observer {
    fun update(state: Int)
}

interface Subject {
    fun registerObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObservers()
}

// 주제 클래스
class ConcreteSubject : Subject {
    private var state = 0
    private val observers: MutableList<Observer> = ArrayList()

    fun getState(): Int {
        return state
    }

    @Synchronized
    fun setState(state: Int) {
        this.state = state
        notifyObservers() // 상태 변경 시 옵저버들에게 알림
    }

    @Synchronized
    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }


    @Synchronized
    override fun removeObserver(o: Observer) {
        val i = observers.indexOf(o)
        if (i >= 0) {
            observers.removeAt(i)
        }
    }

    @Synchronized
    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(state)
        }
    }
}

// 옵저버 클래스
class ConcreteObserver : Observer {
    override fun update(state: Int) {
        synchronized(this) {
            println("Subject의 상태가 변경되었습니다. 새로운 상태: $state")
            try {
                Thread.sleep(1000) // 잠시 대기
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }
    }
}

// 테스트 클래스

fun main(args: Array<String>) {
    val subject = ConcreteSubject()
    val observer1 = ConcreteObserver()
    val observer2 = ConcreteObserver()

    // 옵저버 등록
    subject.registerObserver(observer1)
    subject.registerObserver(observer2)

    // 주제의 상태 변경
    for (i in 0..4) {
        val temp = i
        Thread {
            subject.setState(temp)
        }.start()
    }
}
