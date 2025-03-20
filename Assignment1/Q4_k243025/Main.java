package A2.Q4_k243025;

public class Main {
    public static void main(String[] args) {
        BusStop stop1 = new BusStop("S1", "Main Gate");
        BusRoute route = new BusRoute("R1");
        route.addStop(stop1);
        Bus bus = new Bus("B1", "John Doe", 40, route);
        TransportSystem system = new TransportSystem(bus, route);
        
        Student student1 = new Student("1001", "Danish Ahmed", "C12345", 50.0, stop1);
        system.registerStudent(student1);
        system.processPayment(student1, 100);
        system.recordAttendance(student1);
    }
}