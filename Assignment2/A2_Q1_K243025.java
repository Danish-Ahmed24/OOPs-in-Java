package Assignment2;
import java.util.ArrayList;

public class A2_Q1_K243025 {
    public static void main(String[] args) {
        Studnt studnt1 = new Studnt("S001", "John Doe", "john.doe@example.com");
        Teacher teacher1 = new Teacher("T001", "Jane Smith", "jane.smith@example.com");
        Staff staff1 = new Staff("ST001", "Mike Johnson", "mike.johnson@example.com");

        studnt1.register();
        studnt1.payFee();

        teacher1.register();
        teacher1.payFee();

        staff1.register();
        staff1.payFee();

        Card studntCard = new Card("C001", 100.0);
        studnt1.activateCard(studntCard);

        Route route1 = new Route("R001");
        route1.addStop("Stop 1");
        route1.addStop("Stop 2");

        Bus bus1 = new Bus("B001");
        bus1.addRoute(route1);

        bus1.recordAttendance(studnt1);
    }
}

class Person {
    protected String id;
    protected String name;
    protected String email;

    public Person(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void register() {
        System.out.println(name + " has been registered for transportation.");
    }

    public void payFee() {
        System.out.println(name + " pays fee for transportation.");
    }
}

class Studnt extends Person {
    private boolean registered;
    private Card card;

    public Studnt(String id, String name, String email) {
        super(id, name, email);
        this.registered = false;
    }

    public void register() {
        this.registered = true;
        System.out.println(name + " has been registered for transportation.");
    }

    public void payFee() {
        System.out.println(name + " pays semester fee for transportation.");
    }

    public void activateCard(Card card) {
        this.card = card;
        System.out.println(name + "'s card has been activated.");
    }
}

class Teacher extends Person {

    public Teacher(String id, String name, String email) {
        super(id, name, email);
    }

    public void register() {
        System.out.println(name + " has been registered for transportation.");
    }

    public void payFee() {
        System.out.println(name + " pays monthly fee for transportation.");
    }
}

class Staff extends Person {

    public Staff(String id, String name, String email) {
        super(id, name, email);
    }

    public void register() {
        System.out.println(name + " has been registered for transportation.");
    }

    public void payFee() {
        System.out.println(name + " pays monthly fee for transportation.");
    }
}

class Bus {
    private String busId;
    private Route route;
    private ArrayList<Attendance> attendanceRecords;

    public Bus(String busId) {
        this.busId = busId;
        this.attendanceRecords = new ArrayList<>();
    }

    public void addRoute(Route route) {
        this.route = route;
    }

    public void recordAttendance(Studnt studnt) {
        Attendance attendance = new Attendance(studnt);
        attendanceRecords.add(attendance);
        System.out.println(studnt.getName() + "'s attendance recorded.");
    }
}

class Route {
    private String routeId;
    private ArrayList<String> pickUpPoints;

    public Route(String routeId) {
        this.routeId = routeId;
        this.pickUpPoints = new ArrayList<>();
    }

    public void addStop(String stop) {
        pickUpPoints.add(stop);
    }

    public ArrayList<String> getStops() {
        return pickUpPoints;
    }

    public boolean equals(Route route) {
        return this.routeId.equals(route.routeId);
    }
}

class Attendance {
    private String studntId;
    private String busId;
    private String timestamp;

    public Attendance(Studnt studnt) {
        this.studntId = studnt.getId();
        this.busId = studnt.getId();
        this.timestamp = String.valueOf(System.currentTimeMillis());
    }
}

class Card {
    private String cardId;
    private double balance;
    private boolean status;

    public Card(String cardId, double balance) {
        this.cardId = cardId;
        this.balance = balance;
        this.status = false;
    }

    public void updateStatus(boolean status) {
        this.status = status;
    }

    public double checkBalance() {
        return balance;
    }
}

class Payment {
    private String paymentId;
    private double amount;

    public Payment(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " made successfully.");
    }

    public boolean verifyPayment() {
        System.out.println("Payment verified.");
        return true;
    }
}
