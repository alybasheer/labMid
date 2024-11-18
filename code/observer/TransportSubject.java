package observer;

import java.util.ArrayList;
import java.util.List;

// Subject for Observer Pattern
public class TransportSubject {
    private List<TransportObserver> observers = new ArrayList<>();

    // Add observer
    public void attach(TransportObserver observer) {
        observers.add(observer);
    }

    // Notify all observers
    public void notifyObservers(String message) {
        for (TransportObserver observer : observers) {
            observer.update(message);
        }
    }
}

