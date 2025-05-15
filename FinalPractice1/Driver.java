package FinalPractice1;

public class Driver {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(100);
        Flight flight1 = new Flight("Prague","Vienna",150,"First Class");
        BusTrip busTrip = new BusTrip("Vienna","Venice",92);
        ticket.addTrip(flight1);
        ticket.addTrip(busTrip);
        System.out.println(ticket.toString());
        int sum =0;
        for(Trip t : ticket.getTrips())
        {
            if(t!=null)
            {

            sum+=t.getBasicPrice();
            }
        }
        System.out.println("Ticket Price: "+sum);
        ticket.reduceCost();
        sum =0;
        for(Trip t : ticket.getTrips())
        {
            if(t != null)
            {
            sum+=t.getBasicPrice();

            }
        }
        System.out.println(
                "After Reducing Price: "+sum
        );











        int i =0;
        for(Trip t : ticket.getTrips())
        {
            if(t instanceof BusTrip)
            {
                i++;
            }
        }
        System.out.println("Number of Bus trips are : "+i);
    }
}
