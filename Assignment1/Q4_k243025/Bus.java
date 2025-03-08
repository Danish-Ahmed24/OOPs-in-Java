package A2.Q4_k243025;

public class Bus {
    private String busNumber;
    private String driverName;
    private int capacity;
    private BusRoute assignedRoute;
    
    public Bus(String busNumber, String driverName, int capacity, BusRoute assignedRoute) {
        this.busNumber = busNumber;
        this.driverName = driverName;
        this.capacity = capacity;
        this.assignedRoute = assignedRoute;
    }
}