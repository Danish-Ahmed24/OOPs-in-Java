package lab10;

import A2.Q4_k243025.Bus;

interface RideService {
    public void calculateFare(double distance);
    public void getRideType();
    public void paymentMode();
    final int BASE_FARE = 100;
}
class EconomyRide implements RideService{
    private double fare = BASE_FARE+1000;

    @Override
    public void getRideType() {
        System.out.println("Economy Ride");
    }

    @Override
    public void paymentMode() {
        System.out.println("Paypal or JazzCash");
    }

    @Override
    public void calculateFare(double distance) {
        System.out.println("Fare: "+distance*fare);
    }
}
class BusinessRide implements RideService{
    private double fare = BASE_FARE+5000;

    @Override
    public void getRideType() {
        System.out.println("Business Ride");
    }

    @Override
    public void paymentMode() {
        System.out.println("Bank Card");
    }

    @Override
    public void calculateFare(double distance) {
        System.out.println("Fare: "+distance*fare);
    }
}
class BikeRide implements RideService{
    private double fare = BASE_FARE;
    BikeRide(double fare)
    {
        super();
        this.fare+=fare;
    }
    @Override
    public void getRideType() {
        System.out.println("Ride Service");
    }

    @Override
    public void paymentMode() {
        System.out.println("Cash");
    }

    @Override
    public void calculateFare(double distance) {
        System.out.println("Fare: "+distance*fare);
    }
}
public class Q8_lab10 {

    public static void main(String[] args) {
        BusinessRide br = new BusinessRide();
        System.out.print("Ride Type: ");
        br.getRideType();
        System.out.print("Payment Mode: ");
        br.paymentMode();
        br.calculateFare(1000);

        EconomyRide er = new EconomyRide();
        System.out.print("Ride Type: ");
        er.getRideType();
        System.out.print("Payment Mode: ");
        er.paymentMode();
        er.calculateFare(100);

        RideService rides[] ={new BikeRide(20),new BikeRide(10),new BikeRide(40)};
        for(RideService ride : rides)
        {
            System.out.print("Ride Type: ");
            ride.getRideType();
            System.out.print("Payment Mode: ");
            ride.paymentMode();
            ride.calculateFare(100);
        }
    }
}
