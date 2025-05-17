package FinalPractice3;

public class Checking  extends Account{
    public Checking(int accNum,double bal)
    {
        super(accNum,bal);
    }

    @Override
    public String toString() {
        return  "Checking account: "+  super.toString();
    }
    @Override
    public double computeInterest()
    {
        return 0;
    }
}
