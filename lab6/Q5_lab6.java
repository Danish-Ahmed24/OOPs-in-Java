package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5_lab6 {
    static ArrayList<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
        Manage manager = new Manage();
        Scanner in = new Scanner(System.in);
        boolean exit = true;


            while(exit)
            {
                char c = manager.displayMenu();
                if(c == '1' || c=='2'||
                        c == '3' || c=='4'||
                        c == '5'
                )
                {
                    switch (c)
                    {
                        case '1':
                            manager.add();
                            break;
                        case '2':
                            manager.displayAll();
                            break;
                        case '3':
                            String dp;
                            System.out.println("Enter department: ");
                            dp=in.next();
                            manager.search(dp);
                        case '4':
                            System.out.println("Average salary is "+manager.avgSalary());
                        case '5':
                            exit = false;
                            break;

                    }
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

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, String department, long salary)
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
    public long avgSalary()
    {
        long avg =0;
        for(Employee e : Q5_lab6.employees)
        {
            avg+=e.getSalary();
        }
        avg /=Q5_lab6.employees.size();
        return (avg);
    }
    public void add()
    {int id;
        String name;
        String department;
        long salary;
        System.out.println("Enter ID: ");
        id=in.nextInt();
        System.out.println("Enter name: ");
        name=in.next();
        System.out.println("Enter department: ");
        department=in.next();
        System.out.println("Enter salary: ");
        salary=in.nextLong();
        Employee e = new Employee(id,name,department,salary);
        System.out.println("Employee Added!");}
    public void displayAll()
    {
        for(Employee e : Q5_lab6.employees)
        {
            System.out.println("ID: "+e.getEmployeeId()+" Name: "+e.getEmployeeName()+"\n Department: "+e.getDepartment()+ " Salary: "+e.getSalary());
        }
    }
    public void search(String department)
    {
                System.out.print("IDs: ");
        for(Employee e : Q5_lab6.employees)
        {
            if(e.getDepartment().equals(department))
            {
                System.out.print(" "+e.getEmployeeId());
            }
        }
    }
}