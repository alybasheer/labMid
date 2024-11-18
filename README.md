Transport System in Java
This project implements a Transport Management System using *Observer Pattern, **Layered Architecture, and *Pipe-and-Filter Design. The system allows users to manage transport types while providing modular and maintainable code.

Key Features
Observer Pattern:

Used for notifying observers whenever a transport record is saved.
Example: A logger observes and logs transport system updates.
Three-Layered Architecture:

Presentation Layer: Handles user input.
Business Logic Layer: Processes user input and applies rules.
Data Layer: Stores the transport records and triggers notifications.
Pipe-and-Filter Design:

Sequential processing from input to storage.
Transport Types:

Public Transport: Pay on the spot.
Own Convenience: Flexible schedule with "pay-as-you-use."
University Transport: Advance payment with timing restrictions.
Code Overview
Class Diagram
The project uses the following key classes:

TransportInput: Collects user input.
TransportProcessor: Processes the input.
TransportStorage: Saves transport records.
TransportSubject: Manages the observers.
Observer Interface: Defines a contract for observers.
NotificationLogger: A concrete observer to log notifications.
How Observer Pattern Works
TransportSubject maintains a list of observers.
Whenever a record is saved, the notifyObservers() method is called.
The NotificationLogger (an observer) is notified to log the event.
Code Snippets
Observer Pattern
The Observer Pattern is used to handle notifications:

public interface Observer {
    void update(String message);
}

public class NotificationLogger implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Logger: " + message);
    }
}

public class TransportSubject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
