package business;

// Business Logic Layer - Processes User Choice
public class TransportProcessor {
    public String processChoice(String choice) {
        switch (choice) {
            case "1":
                return "Public Transport - Pay on Spot";
            case "2":
                return "Own Vehicle - Flexible Schedule, Pay as You Use";
            case "3":
                return "University Transport - Advance Payment, Timing Restrictions";
            default:
                return "Invalid Choice!";
        }
    }
}
