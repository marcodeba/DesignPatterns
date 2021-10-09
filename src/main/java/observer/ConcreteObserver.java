package observer;

public class ConcreteObserver implements Observer {
    private String observerState;

    @Override
    public void update(String state) {
        observerState = state;
        System.out.println("״̬Ϊ��" + observerState);
    }
}
