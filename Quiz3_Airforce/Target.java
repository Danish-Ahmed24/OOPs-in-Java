package Quiz3_Airforce;

public class Target {
    private String targetId,location;
    private int defenseLevel,threatLevel,damageStatus;

    public Target(String targetId,String location,int defenseLevel,int threatLevel,int damageStatus)
    {
        this.targetId=targetId;
        this.location=location;
        this.defenseLevel=defenseLevel;
        this.threatLevel=threatLevel;
        this.damageStatus=damageStatus;
    }
    public boolean isHotspot()
    {
        if(this.threatLevel>80 &&  this.defenseLevel < 40)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public String getTargetId() {
        return targetId;
    }
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getDefenseLevel() {
        return defenseLevel;
    }
    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }
    public int getThreatLevel() {
        return threatLevel;
    }
    public void setThreatLevel(int threatLevel) {
        this.threatLevel = threatLevel;
    }
    public int getDamageStatus() {
        return damageStatus;
    }
    public void setDamageStatus(int damageStatus) {
        this.damageStatus = damageStatus;
    }

}
