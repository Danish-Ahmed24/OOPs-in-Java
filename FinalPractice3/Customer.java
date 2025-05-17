package FinalPractice3;

import java.util.Arrays;

public class Customer {
    private int id;
    private String name;
    private Account[] accounts;
    private static int accountsCounter =0;

    public Customer(int id,String name)
    {
        this.id=id;
        this.name=name;
        accounts = new Account[10];
    }
    public void addAccount(Account a)
    {
        accounts[accountsCounter] = a;
        accountsCounter++;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }

}
