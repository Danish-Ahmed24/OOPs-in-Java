package Q4;

public class Delivery_Q4 {
    protected void calculateDeliveryTime(){
        System.out.println("Cost Delivery");
    }
}
class ExpressDelivery extends Delivery_Q4 {
    protected void calculateDeliveryTime(){
        System.out.println("Cost Express Delivery");
    }
}
class StandardDeliver extends Delivery_Q4 {
    protected void calculateDeliveryTime(){
        System.out.println("Cost Standard Delivery");
    }
}
class Main{
    public static void main(String[] args) {
        Delivery_Q4 express = new ExpressDelivery();
        Delivery_Q4 standard = new StandardDeliver();
        System.out.println("After upcasting below is down casting>");
//        ExpressDelivery expressDOWN;
//        StandardDeliver standardDOWN;
        if(express instanceof ExpressDelivery)
        {
            ExpressDelivery expressDOWN =(ExpressDelivery) express;
        expressDOWN.calculateDeliveryTime();
        }
        else{
            System.out.println("ERROR");
        }

        if(standard instanceof StandardDeliver)
        {
            StandardDeliver standardDOWN =(StandardDeliver) standard;
        standardDOWN.calculateDeliveryTime();
        }
        else{
            System.out.println("ERROR");
        }
    }
}