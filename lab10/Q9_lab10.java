package lab10;
abstract class UberRide{
    protected int rideId;
    protected float distance;
    protected int baseFare;

    public UberRide(int id,float distance, int fare){
        this.rideId=id;
        this.distance=distance;
        this.baseFare=fare;
    }

    public abstract int calculateFare();
    public abstract void dispatchDriver();

    public void printReceipt()
    {
        System.out.println("Ride ID: "+this.rideId);
        System.out.println("Distance: "+this.distance);
        System.out.println("Fare: "+this.calculateFare());
    }
}
class UberX extends UberRide{
    public UberX(int id,float distance,int fare)
    {
        super(id,distance,fare);
    }
    @Override
    public int calculateFare() {
        baseFare*=2;
        return baseFare;
    }

    @Override
    public void dispatchDriver() {
        System.out.println("Dispatching UBERX driver");
    }
}
class UberBlack extends UberRide{
    public UberBlack(int id,float distance,int fare)
    {
        super(id,distance,fare);
    }
    @Override
    public int calculateFare() {
        return baseFare*3-baseFare;
    }

    @Override
    public void dispatchDriver() {
        System.out.println("Dispatching uberBlack driver");
    }
}
class UberXL extends UberRide{
    public UberXL(int id,float distance,int fare)
    {
        super(id,distance,fare);
    }
    @Override
    public int calculateFare() {
        return baseFare*5;
    }

    @Override
    public void dispatchDriver() {
        System.out.println("Dispatching Uber XL driver");
    }
}
class RideAnalytics{
    public void analytics(UberRide uberRide)
    {
        System.out.println("Category: "+uberRide.getClass().getSimpleName());
        System.out.println("Fare: "+uberRide.calculateFare());
    }
}
public class Q9_lab10 {
    public static void main(String[] args) {
        UberBlack ub = new UberBlack(1,322,100);
        UberX x = new UberX(2,400,1000);
        UberXL xl = new UberXL(3,2000,4000);
        RideAnalytics a = new RideAnalytics();
        ub.dispatchDriver();
        ub.printReceipt();
        a.analytics(ub);
        x.dispatchDriver();
        x.printReceipt();
        a.analytics(x);
        xl.dispatchDriver();
        xl.printReceipt();
        a.analytics(xl);
    }
}
