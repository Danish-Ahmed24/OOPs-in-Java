package PastPaper.Q2;

public class Customer {
    private int accountNumber;
    private char accountType;
    private int minimumBalance = 1000;
    private int currentBalance;
    private int interest;

    public Customer(int accountNumber,int currentBalance,char accountType)
    {
        if(accountType=='s' || accountType=='c')
        {
            this.accountType=accountType;
        }
        else {
            System.out.println("Invalid type");
        }
        if(currentBalance>=0)
        {
            this.currentBalance=currentBalance;
        }
        else {
            System.out.println("Invalid balance");
        }
        this.accountNumber=accountNumber;
        this.interest=calcInterest();
    }
    public int calcInterest()
    {
        if(this.accountType=='s')
        {
            if(this.currentBalance>=this.minimumBalance)
            {
                return 4;
            }
        }
        else
        {
            if(this.currentBalance>=this.minimumBalance)
            {
                if(this.currentBalance>1000)
                {
                    return 3;
                }
                return 5;
            }
        }
        return 0;
    }
    void display()
    {
        System.out.println("----------------------------------");
        System.out.println("Account Number: "+this.accountNumber);
        System.out.println("Account Type: "+this.accountType);
        System.out.println("Current Balance: "+this.currentBalance);
        System.out.println("Interest Gain: "+this.interest+"%");
        System.out.println("----------------------------------");
    }
}
