package A2.Q4_k243025;

import java.util.*;

public class TransportSystem {
    private ArrayList<Student> studentsList = new ArrayList<>();
    private Bus bus;
    private BusRoute route;
    
    public TransportSystem(Bus bus, BusRoute route) {
        this.bus = bus;
        this.route = route;
    }
    
    public void registerStudent(Student student) {
        studentsList.add(student);
        student.register();
    }
    
    public void processPayment(Student student, double amount) {

        student.payFees(amount);
    }
    
    public void recordAttendance(Student student) {

        student.tapCard();
    }
}