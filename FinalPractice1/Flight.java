package FinalPractice1;

public class Flight extends Trip implements Economical{
    private String seatClass;
    public Flight(String dc,String ac,double bp,String seatClass){
        super(dc,ac,bp);
        if(seatClass.equals("First Class") || seatClass.equals("Economic"))
        {
            this.seatClass=seatClass;
        }
        else {
            this.seatClass="Invalid Class";
        }
    }
    public String toString()
    {
        return "A flight departing from "+getDepartureCity()+", going to "+getArrivalCity()+" for a basic price of "+getBasicPrice()+"$ \nThe Seat class reserved for the flight is "+this.seatClass;
    }
    public double calculateCost()
    {
        if(seatClass.equalsIgnoreCase("Economic"))
        {
            return getBasicPrice();
        }
        else if(seatClass.equalsIgnoreCase("First Class"))
        {
            return getBasicPrice() * 2.5;
        }
        else {
            System.out.println("Invalid Class");
            return getBasicPrice();
        }
    }
    public void economize()
    {
        this.seatClass="Economic";
    }
}
