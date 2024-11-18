package application;

import presentation.TransportInput;
import business.TransportProcessor;
import data.TransportStorage;
import observer.NotificationLogger;
import observer.TransportSubject;

// Main Application - Integrates All Layers
public class TransportApplication {
    public static void main(String[] args) {
        // Observer Pattern Setup
        TransportSubject subject = new TransportSubject();
        NotificationLogger logger = new NotificationLogger();
        subject.attach(logger);

        // Layered Architecture Components
        TransportInput input = new TransportInput();
        TransportProcessor processor = new TransportProcessor();
        TransportStorage storage = new TransportStorage(subject);

        // Pipeline Execution
        String choice = input.getTransportChoice();            // Step 1: User Input
        String result = processor.processChoice(choice);       // Step 2: Process Input
        storage.saveRecord(result);                            // Step 3: Save and Notify
    }
}
