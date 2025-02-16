package Q4;

import java.util.Scanner;

public class Employee {
    private int id;
    Scanner in = new Scanner(System.in);
    private String name;
    private float netSalary,bonus,salary,taxDeductPer;
    Employee()
    {
        System.out.println("Default Employee Created:");
        this.id = 0;
        this.name = "unknown";
        this.salary = 0.0f;
        this.taxDeductPer = 0.0f;
        this.bonus = 0.0f;
        this.netSalary=0.0f;

    }
    Employee(int id,String name,float salary , float per)
    {
        System.out.println("New Employee Created:");
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.taxDeductPer = per;
        System.out.println("Enter bonus for\n"+this.name);
        this.bonus = in.nextFloat();
        this.netSalary=this.salary-((this.taxDeductPer*this.salary)/100)+bonus;

    }
    void displayInfo()
    {
        System.out.println("Id: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Salary: "+this.salary);
        System.out.println("Tax deduction Rate: "+this.taxDeductPer);
        System.out.println("Total Bonus: "+this.bonus);
        System.out.println("Total Salary: "+this.netSalary);
    }
    void deleteDemo()
    {
        System.out.println("\nEmployee record deleted: "+this.id);
        System.out.println("Memory for bonus released.");
    }
}

