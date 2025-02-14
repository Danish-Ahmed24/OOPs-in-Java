package Q1;

public class Main {


    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.displayInfo();
        c1=null;
        System.gc();
    }
}
