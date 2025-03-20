package Q3;

class Employee {
    protected float salary;
    protected void calculateSalary(float percentage){

        salary*=percentage;
        System.out.println("Salary : "+this.salary);
    }
}
class FullTimeEmployee extends Employee{
    protected void calculateSalary(float percentage){
        salary=100000;
        salary*=percentage;
        salary/=100;
        System.out.println("Salary of full time employee : "+this.salary);
    }
}
class PartTimeEmployee extends Employee{
    protected void calculateSalary(float percentage){
        salary=10000;
        salary*=percentage;
        salary/=100;
        System.out.println("Salary of part time employee : "+this.salary);
    }
}
class Main {
    public static void main(String[] args) {
        Employee e1 = new PartTimeEmployee();
        Employee e2 = new FullTimeEmployee();
        e1.calculateSalary(30);
        e2.calculateSalary(50);
    }
}