package observer.threadUnsafe;
import java.util.Observable;
import java.util.Observer;

class ConcreteSubject extends Observable {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        setChanged(); // 상태 변경 여부를 알림
        notifyObservers(); // 옵저버들에게 알림
    }
}

class ConcreteObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        ConcreteSubject subject = (ConcreteSubject) o;
        System.out.println("Subject의 상태가 변경되었습니다. 새로운 상태: " + subject.getState());
        try {
            Thread.sleep(1000); // 잠시 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ObserverThreadUnSafetyExample {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();

        // 옵저버 등록
        subject.addObserver(observer1);
        subject.addObserver(observer2);


        // 주제의 상태 변경
        for (int i = 0; i < 3; i++) {
            int temp = i;
            new Thread(() -> {
                    subject.setState(temp);

            }).start();
        }
    }
}