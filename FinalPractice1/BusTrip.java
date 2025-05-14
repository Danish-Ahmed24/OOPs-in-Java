package FinalPractice1;

public class BusTrip extends Trip{
    public BusTrip(String dc,String ac,double bp)
    {
        super(dc,ac,bp);
    }
    public double calculateCost()
    {
        return getBasicPrice();
    }
    public String toString()
    {
        return "A bus trip departing from "+ getDepartureCity() + ", going to "+getArrivalCity()+" for basic price of "+getBasicPrice() + "$.";
    }
}
