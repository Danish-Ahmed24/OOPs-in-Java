package lab9;

class Accounts{
    protected int balance=0;

    public void debit(int amount)
    {
        if(amount<=balance)
        {
            balance-=amount;
            System.out.println(amount+" Withdrawn");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
    public void credit(int deposit)
    {
        this.balance+=deposit;
        System.out.println("Deposited: "+deposit);
    }
    public void getBalance()
    {
        System.out.println(" Current Balance: "+balance);
    }
}
class SavingAccount extends Accounts{
    private int timeSpan;
    public SavingAccount(int timeSpan)
    {
        super();
        this.timeSpan=timeSpan;
    }
    public float calculateInterest()
    {
        return (balance)*(0.3f)*timeSpan;
    }
    @Override
    public void credit(int deposit)
    {
        super.credit(deposit);
        float interest = calculateInterest();
        super.balance-=interest;
        System.out.println("Interest deducted: " + interest);
    }
}
public class Q8_lab9 {

    public static void main(String[] args) {
        SavingAccount s = new SavingAccount(2);
        s.credit(1_000_000);
        s.getBalance();
        s.debit(50_000);
        s.getBalance();
    }
}
