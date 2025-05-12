package Quiz3_Airforce;

public abstract class MilitaryUnit {
    protected String unitName,unitType,location;
    protected int strength;

    public MilitaryUnit(String unitName,String unitType,String location,int strength)
    {
        this.location=location;
        this.unitName=unitName;
        this.unitType=unitType;
        this.strength=strength;
    }

    public abstract void deploy();
    public abstract void reportStatus();

}
