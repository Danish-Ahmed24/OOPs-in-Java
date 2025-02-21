package Q8;

public class Employee {
    String eName;
    int eID;
    String eDepartment;
    public Employee(){
        this.eName="dummy";
        this.eID=0;
        this.eDepartment="dummy";
    }
    public Employee(String employeeName,int employeeID,String employeeDepartment){
        this.eName=employeeName;
        this.eID=employeeID;
        this.eDepartment=employeeDepartment;
    }
    public void displayEmployeeDetails(){
        System.out.println("Employee Created: "+this.eName+"\nID: "+this.eID+"\nDepartment: "+this.eDepartment);
    }
}
class Manager extends Employee{
    int teamSize;
    Manager(String eName,int eID,String eDepartment,int teamSize){
        super(eName,eID,eDepartment);
        this.teamSize=teamSize;
    }
    public void displayDetails(){
        System.out.println("Manager Created: "+this.eName+" manages a team of "+this.teamSize+" members");
    }

}

