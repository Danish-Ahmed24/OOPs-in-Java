package Quiz3_Airforce;

public class JetFighter extends MilitaryUnit implements AirStrikeCapabiliity{
    private int missileCapacity,fuelLevel;
    public JetFighter(int missileCapacity,int fuelLevel,String unitName,String unitType,String location,int strength)
    {
        super(unitName,unitType,location,strength);
        this.missileCapacity=missileCapacity;
        this.fuelLevel=fuelLevel;
    }

    @Override
    public void deploy()
    {
        System.out.println("Deployed success!");
        reportStatus();
    }
    @Override
    public void reportStatus()
    {
        System.out.println("Status: missileCapacity: "+this.missileCapacity+" FuelLevel: "+this.fuelLevel);
    }
    @Override
    public void launchAirStrike(Target target){
        try{
            if(getFuelLevel()<0)
            {
                throw new LowFuelException("Fuel Level cannot be less than 0");
            }
        }catch (LowFuelException e)
        {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void launchAirStrike(Target target,int missileCount){
        try{
            if(getFuelLevel()<0)
            {
                throw new LowFuelException("Fuel Level cannot be less than 0");
            }
        }catch (LowFuelException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public int getMissileCapacity()
    {
        return this.missileCapacity;
    }
    public int getFuelLevel()
    {
        return this.fuelLevel;
    }
}
