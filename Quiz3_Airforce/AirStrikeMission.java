package Quiz3_Airforce;

import java.util.ArrayList;

public class AirStrikeMission extends Mission{
    private ArrayList<JetFighter> jets;
    private Target target;
    private boolean missionStatus;

    public AirStrikeMission(String missionId,String targetLocation,String missionType){
        super(missionType,targetLocation,missionType);
    }

    @Override
    public boolean executeMission() throws Exception
    {
        for(JetFighter jet : jets)
        {
            jet.launchAirStrike(target);
        }
        return true;
    }

    public Target getTarget() {
        return target;
    }

    public ArrayList<JetFighter> getJetFighters() {
        return jets;
    }
}
