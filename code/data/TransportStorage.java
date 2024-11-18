package data;

import java.util.ArrayList;
import java.util.List;
import observer.TransportSubject;

// Data Storage Layer - Saves and Notifies
public class TransportStorage {
    private List<String> records = new ArrayList<>();
    private TransportSubject subject;

    public TransportStorage(TransportSubject subject) {
        this.subject = subject;
    }

    public void saveRecord(String record) {
        records.add(record);
        System.out.println("[TransportStorage] Transport Option Saved: " + record);
        subject.notifyObservers("New transport option selected: " + record);
    }
}
