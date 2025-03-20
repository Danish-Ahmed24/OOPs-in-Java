package Q8;

class Bank {
    private final String BANK_NAME = "Secure Bank";

    public void showBankDetails() {
        System.out.println("Bank: " + BANK_NAME);
    }
}

final class SecureTransaction {
    public void processTransaction() {
        System.out.println("Transaction Processed Securely");
    }
}

class Account {
    private final String accNum;

    public Account(String accNum) {
        this.accNum = accNum;
    }

    public void showAccDetails() {
        System.out.println("AccNum: " + accNum);
    }

    public final void calcIntrst() {
        System.out.println("Intrst Clc Method");
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String accNum) {
        super(accNum);
    }

    public void showSavMsg() {
        System.out.println("Savings Acc Msg");
    }
}

public class BankSys_Q8 {
    public static void main(String[] args) {
        Bank bk = new Bank();
        bk.showBankDetails();

        Account acc = new Account("123456");
        acc.showAccDetails();
        acc.calcIntrst();

        SecureTransaction st = new SecureTransaction();
        st.processTransaction();

        SavingsAccount savAcc = new SavingsAccount("789101");
        savAcc.showAccDetails();
        savAcc.showSavMsg();
    }
}

