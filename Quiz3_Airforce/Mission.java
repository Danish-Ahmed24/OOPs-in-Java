package Quiz3_Airforce;

public abstract class Mission {
    protected String missionId,targetLocation,missionType;
    public Mission(String missionId,String targetLocation,String missionType)
    {
        this.missionId=missionId;
        this.targetLocation=targetLocation;
        this.missionType=missionType;
    }

    public abstract boolean executeMission() throws Exception;
}
