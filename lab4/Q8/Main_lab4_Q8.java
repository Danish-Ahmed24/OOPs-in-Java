package Q8;
import java.util.Scanner;

public class Main_lab4_Q8 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Creating Employees and Managers at Systems Limited...");
        Employee e1=new Employee();
        e1.displayEmployeeDetails();
        System.out.println("Enter the name of the Employee");
        String name=scan.nextLine();
        System.out.println("Enter the ID of the Employee");
        int id=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Department of the Employee");
        String department=scan.nextLine();
        Employee e2=new Employee(name,id,department);
        e2.displayEmployeeDetails();
        System.out.println("Enter the Team Size");
        int size=scan.nextInt();
        Manager manager1=new Manager(name,id,department,size);
        manager1.displayDetails();
        System.out.println("The Employee "+e1.eName+" has been deleted");
        System.out.println("The Manager "+e2.eName+" has been deleted");

        manager1=null;
        e1=null;
        System.gc();
    }
}
