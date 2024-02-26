package observer.threadSafe;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    public void update(int state);
}

interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}

// 주제 클래스
class ConcreteSubject implements Subject{
    private int state;
    private List<Observer> observers = new ArrayList<>();

    public int getState() {
        return state;
    }

    public synchronized void setState(int state) {
        this.state = state;
        notifyObservers(); // 상태 변경 시 옵저버들에게 알림
    }

    public synchronized void registerObserver(Observer observer) {
        observers.add(observer);
    }


    public synchronized void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public synchronized void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

}

// 옵저버 클래스
class ConcreteObserver implements Observer {
    @Override
    public void update(int state) {
        synchronized (this) {
            System.out.println("Subject의 상태가 변경되었습니다. 새로운 상태: " + state);
            try {
                Thread.sleep(1000); // 잠시 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 테스트 클래스
public class ObserverThreadSafetyExample {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();

        // 옵저버 등록
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        // 주제의 상태 변경
        for (int i = 0; i < 5; i++) {
            int temp = i;
            new Thread(() -> {
                subject.setState(temp);

            }).start();
        }
    }
}