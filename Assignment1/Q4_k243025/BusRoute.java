package A2.Q4_k243025;

import java.util.*;

public class BusRoute {
    private String routeID;
    private ArrayList<BusStop> stopsList = new ArrayList<>();
    
    public BusRoute(String routeID) {

        this.routeID = routeID;
    }
    
    public void addStop(BusStop stop) {

        stopsList.add(stop);
    }
}