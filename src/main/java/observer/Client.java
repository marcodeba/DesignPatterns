package observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.registerObserver(observer);

        subject.change("new state");
    }
}
