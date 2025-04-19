package lab10;

interface Payment{
    public void pay(double amount);
    public void getPaymentDetails();
    public static void paymentPolicy(){
        System.out.println("Thanks for your transaction");
    }
}
class CreditCardPayment implements Payment{
    private int amount;
    @Override
    public void pay(double amount) {
        System.out.println("transcation success");
        this.amount+=amount;
    }

    @Override
    public void getPaymentDetails() {
        System.out.println("Amount paid using credit card: "+this.amount);
    }
}
class PayPalPayment implements Payment{
    private int amount;
    @Override
    public void pay(double amount) {
        System.out.println("transcation success");
        this.amount+=amount;
    }

    @Override
    public void getPaymentDetails() {
        System.out.println("Amount paid using PayPal: "+this.amount);
    }
}
class BitcoinPayment implements Payment{
    private int amount;
    @Override
    public void pay(double amount) {
        System.out.println("transcation success");
        this.amount+=amount;
    }

    @Override
    public void getPaymentDetails() {
        System.out.println("Amount paid using Bit Coin: "+this.amount);
    }
}

public class Q7_lab10 {

    public static void main(String[] args) {
        Payment payments[] = {new BitcoinPayment(),new CreditCardPayment(),new PayPalPayment()};
        for(Payment payment : payments)
        {
            payment.pay(1000);
            payment.getPaymentDetails();
            Payment.paymentPolicy();
        }
    }
}
