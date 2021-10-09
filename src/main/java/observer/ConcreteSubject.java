package observer;

public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {
        state = newState;
        System.out.println("change state" + state);
        this.nodifyObservers(state);
    }
}
