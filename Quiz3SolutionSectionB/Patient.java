package Quiz3SolutionSectionB;

public class Patient extends Person implements VitalsRecordable{
    private String campLocation;
    private Vitals vitals;//compose
    private Doctor assignedDoctor;//aggregrate


    @Override
    public void updateVitals(double update) {
        this.vitals.setTemperature(update);
    }
    @Override
    public void updateVitals(double update,boolean isF)
    {
        this.vitals.setTemperature(update,isF);
    }
    public String getCampLocation() {
        return campLocation;
    }

    public Vitals getVitals() {
        return vitals;
    }
}
