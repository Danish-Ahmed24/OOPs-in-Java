package A2.Q3_k243025;

import java.util.ArrayList;

public class Vehicle {
    private ArrayList<Vehicle> vehicles;
    private String model;
    private float pricePerDay;
    private ArrayList<String> eligibility;

    public Vehicle(String model,float pricePerDay,ArrayList<String> eligibility)
    {
        this.vehicles = new ArrayList<>();
        this.eligibility=eligibility;
        this.model=model;
        this.pricePerDay=pricePerDay;
        this.vehicles.add(this);
    }

    public ArrayList<String> getEligibility() {
        return eligibility;
    }

    public String getModel() {
        return model;
    }
}