package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Attached an observer");
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void nodifyObservers(String newState) {
        for (Observer observer : observers) {
            observer.update(newState);
        }
    }
}
