package lab10;
import java.util.Scanner;

interface BankAccount {
    public void deposit(double amount);
    public void withDraw(double amount);
    public double getBalance();
}
class SavingsAccount implements BankAccount {
    private double balance=0;

    @Override
    public void deposit(double amount) {
        balance+=amount;
    }

    @Override
    public void withDraw(double amount) {
        balance-=amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
public class Q6_lab10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        SavingsAccount savingsAccount = new SavingsAccount();
        int opt;
        do{
            System.out.println("1. deposit");
            System.out.println("2. withdraw");
            System.out.println("3. balance");
            System.out.println("4. exit");
            opt= in.nextInt();
            switch (opt)
            {
                case 1: savingsAccount.deposit(1000);break;
                case 2: savingsAccount.withDraw(120);break;
                case 3:
                    System.out.println("Amount: "+savingsAccount.getBalance());break;

                case 4: exit = true;
            }
        }while (!exit);
    }
}
