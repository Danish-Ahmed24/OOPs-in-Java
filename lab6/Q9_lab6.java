package lab6;

class Subscription {
    private final String subscriptionID;
    private final String customerName;
    private final String planType;
    private final double price;

    private static int activeSubscriptions = 0;

    public Subscription(String subscriptionID, String customerName, String planType) {
        this.subscriptionID = subscriptionID;
        this.customerName = customerName;
        this.planType = planType;

        if (planType.equalsIgnoreCase("Basic")) {
            this.price = 9.99;
        } else if (planType.equalsIgnoreCase("Pro")) {
            this.price = 19.99;
        } else if (planType.equalsIgnoreCase("Enterprise")) {
            this.price = 49.99;
        } else {
            throw new IllegalArgumentException("Invalid plan type");
        }

        activeSubscriptions++;
    }

    public void display() {
        System.out.println("Subscription ID: " + subscriptionID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Plan Type: " + planType);
        System.out.println("Price: $" + price);
        System.out.println("----------------------");
    }

    public void cancel() {
        System.out.println("Cancelling a Subscription...");
        System.out.println("Subscription ID " + subscriptionID + " has been canceled.");
        activeSubscriptions--;
    }

    public static void displayActiveSubscriptions() {
        System.out.println("Total Active Subscriptions: " + activeSubscriptions);
    }
}

public class Q9_lab6 {
    public static void main(String[] args) {
        Subscription sub1 = new Subscription("S001", "Muhammad Nadeem", "Pro");
        Subscription sub2 = new Subscription("S002", "Minhal Raza", "Enterprise");
        Subscription sub3 = new Subscription("S003", "Monis", "Basic");
        Subscription sub4 = new Subscription("S004", "Talha Shahid", "Pro");

        sub1.display();
        sub2.display();
        sub3.display();
        sub4.display();

        Subscription.displayActiveSubscriptions();

        sub2.cancel();

        Subscription.displayActiveSubscriptions();
    }
}

