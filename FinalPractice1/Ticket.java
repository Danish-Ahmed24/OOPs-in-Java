package FinalPractice1;

public class Ticket {
    private String ticketNumber;
    private static int ticketsCounter = 0;
    private Trip[] trips;
    private int tripNumber; // this is used for the ticket ID, not as a trip counter

    private int tripCount = 0; // ✅ NEW: to track how many trips were added

    public Ticket(int maxNbTrip) {
        this.trips = new Trip[maxNbTrip];
        this.tripNumber = (ticketsCounter + 1); // TN2, TN3...
        this.ticketNumber = "TN" + (tripNumber + 1); // TN2 etc.
        ticketsCounter++;
    }

    public void addTrip(Trip t) {
        if (tripCount < trips.length) { // ✅ use tripCount instead of tripNumber
            this.trips[tripCount] = t;
            tripCount++; // ✅ increment actual trip count
        } else {
            System.out.println("Limit Exceeded");
        }
    }

    public void reduceCost() {
        for (Trip t : trips) {
            if (t != null) {
                if (t instanceof Economical) {
                    ((Economical) t).economize();
                }
                t.calculateCost();
            }
        }
    }

    public String toString() {
        String res = "The ticket " + this.ticketNumber + " has the following trips:\n";
        int i = 1;
        for (Trip t : trips) {
            if (t == null) continue; // ✅ skip nulls
            res += i + ". " + t.toString() + "\n";
            i++;
        }
        res += "It is a VIP reservation";
        return res;
    }
}
