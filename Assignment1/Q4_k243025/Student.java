package A2.Q4_k243025;

import java.util.*;

public class Student {
    private String studentID;
    private String name;
    private String cardNumber;
    private double balance;
    private BusStop assignedStop;
    
    public Student(String studentID, String name, String cardNumber, double balance, BusStop assignedStop) {
        this.studentID = studentID;
        this.name = name;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.assignedStop = assignedStop;
    }
    
    public void register() {

        System.out.println(name + " registered for transportation.");
    }
    
    public void payFees(double amount) {
        balance += amount;
        System.out.println("Fees paid. New balance: " + balance);
    }
    
    public void tapCard() {
        if (balance > 0) {
            balance -= 10; // Deduct fare
            System.out.println("Attendance recorded for " + name);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}