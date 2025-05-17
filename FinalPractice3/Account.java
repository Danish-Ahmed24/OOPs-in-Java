package FinalPractice3;

public abstract class Account {
    protected int number;
    protected double balance;
    public Account(int accNum,double bal)
    {
        this.balance=bal;
        this.number=accNum;
    }
    public abstract double computeInterest();

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", balance=" + balance +
                '}';
    }
}
