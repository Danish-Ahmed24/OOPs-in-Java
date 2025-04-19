package lab10;
abstract class Bank {
    abstract int getBalance();
}
class BankA extends Bank {
    @Override
    int getBalance() {
        return 100;
    }
}
class BankB extends Bank {
    @Override
    int getBalance() {
        return 150;
    }
}
class BankC extends Bank {
    @Override
    int getBalance() {
        return 200;
    }
}
public class Q1_lab10 {
    public static void main(String[] args) {
        Bank A = new BankA();
        Bank B = new BankB();
        Bank C = new BankC();
        System.out.println("BankA: "+A.getBalance()+" $");
        System.out.println("BankB: "+B.getBalance()+" $");
        System.out.println("BankC: "+C.getBalance()+" $");
    }
}

