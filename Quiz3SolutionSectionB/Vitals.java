package Quiz3SolutionSectionB;

public class Vitals {
    private double temperature;
    private boolean isF=false;

    public void setTemperature(double temperature)
    {
        if(isF)
        {
            this.temperature=temperature;
            System.out.println("Temperature: "+this.temperature+" F");
        }else {
            this.temperature=temperature;
            System.out.println("Temperature: "+this.temperature+" C");
        }
    }
    public void setTemperature(double temperature,boolean isF)
    {
        this.isF=isF;
        this.setTemperature(temperature);
    }

    public double getTemperature() {
        return temperature;
    }
}
