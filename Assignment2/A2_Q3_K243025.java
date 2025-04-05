package Assignment2;

class Vehicle {
    protected int id, speed, capacity;
    protected float energyEff;
    private static int totalActiveDeliveries = 0;

    public Vehicle(int id, int speed, int capacity, float energyEff) {
        this.id = id;
        this.speed = speed;
        this.capacity = capacity;
        this.energyEff = energyEff;
        totalActiveDeliveries++;
    }

    public void move() {
        System.out.println("Vehicle " + id + " is moving in a general manner.");
    }

    public void calcOptimalDeliveryRoute() {
        System.out.println("Calculating optimal route for Vehicle " + id);
    }

    public void calcEstimatedDeliveryTime() {
        System.out.println("Calculating estimated delivery time for Vehicle " + id);
    }

    public static int getTotalActiveDeliveries() {
        return totalActiveDeliveries;
    }

    public static Vehicle resolveConflict(Vehicle v1, Vehicle v2) {
        return (v1.speed > v2.speed) ? v1 : v2;
    }
}

class Command {
    private String deliveryType;
    private int packageID;
    private String urgencyLevel;

    public Command(String deliveryType, int packageID, String urgencyLevel) {
        this.deliveryType = deliveryType;
        this.packageID = packageID;
        this.urgencyLevel = urgencyLevel;
    }

    public Command(String deliveryType, int packageID) {
        this(deliveryType, packageID, "normal");
    }

    public void execute(Vehicle vehicle) {
        System.out.println("Executing command for Vehicle " + vehicle.id + " Package: " + packageID + " Urgency: " + urgencyLevel);
        vehicle.calcOptimalDeliveryRoute();
        vehicle.calcEstimatedDeliveryTime();
        vehicle.move();
    }
}

class RamzanDrone extends Vehicle {
    public RamzanDrone(int id) {
        super(id, 150, 5, 9.5f);
    }

    @Override
    public void move() {
        System.out.println(id + " RamzanDrone flying for high-speed delivery");
    }
}

class RamzanTimeShip extends Vehicle {
    public RamzanTimeShip(int id) {
        super(id, 100, 10, 8.0f);
    }

    @Override
    public void move() {
        System.out.println(id + " RamzanTimeShip ensuring historical consistency before delivery.");
    }
}

class RamzanHyperPod extends Vehicle {
    public RamzanHyperPod(int id) {
        super(id, 200, 20, 7.5f);
    }

    @Override
    public void move() {
        System.out.println(id + " RamzanHyperPod navigating underground tunnels for efficient delivery.");
    }
}

public class A2_Q3_K243025 {
    public static void main(String[] args) {
        Vehicle v1 = new RamzanDrone(1);
        Vehicle v2 = new RamzanHyperPod(2);
        Vehicle v3 = new RamzanTimeShip(3);

        Command c1 = new Command("Deliver", 101, "urgent");
        c1.execute(v1);

        Command c2 = new Command("Deliver", 102);
        c2.execute(v2);

        Command c3 = new Command("Deliver", 103, "historical");
        c3.execute(v3);

        System.out.println("Total Active Deliveries: " + Vehicle.getTotalActiveDeliveries());
    }
}
