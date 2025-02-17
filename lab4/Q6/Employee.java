package Q6;

import java.util.Scanner;

public class Employee {
    Scanner in = new Scanner(System.in);
    private int id;
    private String name , department;
    Employee()
    {
        System.out.println("Creating a Manager at Systems Limited...");
        System.out.println("Enter Employee id: ");
        this.id=in.nextInt();
        System.out.println("Enter Employee name: ");
        this.name = in.next();

        System.out.println("Employee Constructor: "+this.name+" (ID: "+ this.id +") from IT");
    }
}
class Manager extends Employee{
    private int teamSize;
    Manager()
    {

        super();
        System.out.println("Enter teamSize: ");
        this.teamSize=in.nextInt();
        System.out.println("Manager Constructor: Manages "+this.teamSize+" team members.");
    }
}
