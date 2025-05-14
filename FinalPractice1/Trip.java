package FinalPractice1;

public abstract class Trip {
    protected String departureCity;
    protected String arrivalCity;
    protected double basicPrice;

    public Trip(String departureCity,String arrivalCity,double basicPrice)
    {
        this.departureCity=departureCity;
        this.arrivalCity=arrivalCity;
        if(basicPrice<0)
        {
            this.basicPrice=50;
        }else {
            this.basicPrice=basicPrice;
        }
    }
    public String toString()
    {
        return "DC: "+departureCity+" AC: "+arrivalCity+" BP: "+basicPrice;
    }
    public abstract double calculateCost();

    public double getBasicPrice() {
        return basicPrice;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }
}