package Quiz3_Airforce;

public class RadarSystem implements DefenseSystem{
    private double radarRange,responseTime;
    public RadarSystem(double rr,double rt)
    {
        this.radarRange=rr;
        this.responseTime=rt;
    }

    @Override
    public void activateDefense(Target target) {

    }

    public double getRadarRange() {
        return radarRange;
    }

    public double getResponseTime() {
        return responseTime;
    }
}
