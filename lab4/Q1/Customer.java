package Q1;

public class Customer {
    int accountNumber;
    String customerName;
    double balance;
    Customer()
    {
        this.accountNumber = 0000;
        this.customerName = "Your_Name_Here";
        this.balance = 0.0;
    }
    Customer(int accNum, String name , double balance)
    {
        this.accountNumber = accNum;
        this.customerName = name;
        this.balance = balance;
    }
    void displayInfo()
    {
        System.out.println(this.accountNumber+"   "+this.balance+" "+this.customerName);
    }
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("Object is deleted!");
    }
}
