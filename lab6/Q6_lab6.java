package lab6;

class Employee_Q6 {
    protected String employeeID;
    protected String name;
    protected double salary;

    public Employee_Q6(String employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }
}

class Developer_Q6 extends Employee_Q6 {
    protected String programmingLanguage;

    public Developer_Q6(String employeeID, String name, double salary, String programmingLanguage) {
        super(employeeID, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public boolean isProficientInJava() {
        return programmingLanguage.equalsIgnoreCase("Java");
    }
}

class SoftwareArchitect extends Developer_Q6 {
    private int projectCount;

    public SoftwareArchitect(String employeeID, String name, double salary, String programmingLanguage, int projectCount) {
        super(employeeID, name, salary, programmingLanguage);
        this.projectCount = projectCount;
    }

    public boolean isEligibleForLeadership() {
        return projectCount >= 5;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Proficient in Java: " + (isProficientInJava() ? "Yes" : "No"));
        System.out.println("Project Count: " + projectCount);
        System.out.println("Eligible for Leadership: " + (isEligibleForLeadership() ? "Yes" : "No"));
    }
}

public class Q6_lab6 {
    public static void main(String[] args) {
        SoftwareArchitect architect = new SoftwareArchitect("E001", "Ali Khan", 150000, "Java", 6);
        architect.displayDetails();
    }
}
