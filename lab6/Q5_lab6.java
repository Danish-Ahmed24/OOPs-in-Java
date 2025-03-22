package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5_lab6 {
    static ArrayList<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
        Manage manager = new Manage();

        while(true)
        {
            if(manager.displayMenu() == '1' || manager.displayMenu()=='2'||
                    manager.displayMenu() == '3' || manager.displayMenu()=='4'||
                    manager.displayMenu() == '5'
            )
            {
                break;
            }
            else
            {
                System.out.println("Enter valid option (1 to 5)");
            }
        }

    }
}
class Employee {
    private int employeeId;
    private String employeeName;
    private String department;
    private long salary;

    public Employee(int id,String name,String department,long salary)
    {
        this.employeeId=id;
        this.employeeName=name;
        this.department=department;
        this.salary=salary;
        Q5_lab6.employees.add(this);
    }
}
class Manage{
    Scanner in = new Scanner(System.in);
    public char displayMenu()
    {
        char ch;
        System.out.println("1. Add employee");
        System.out.println("2. Display all employees");
        System.out.println("3. Search by department ");
        System.out.println("4. Calculate average salary ");
        System.out.println("5. Exit ");
        System.out.println("Enter the choice: ");
        ch = in.next().charAt(0);
        return ch;
    }
}