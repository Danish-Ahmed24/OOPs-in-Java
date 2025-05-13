package Quiz3_Airforce;

import java.util.ArrayList;
import java.util.Arrays;

public class ControlCenter {
    private ArrayList<JetFighter> jets;
    private RadarSystem radar;
    private ArrayList<Target> targets;

    public ControlCenter(ArrayList<Target> targets)
    {
        this.targets=targets;
    }
    public void addJetFighters(JetFighter[] jets)
    {
        this.jets.addAll(Arrays.asList(jets));

    }

    public ArrayList<JetFighter> getAllAvailableJets() {
        return jets;
    }

    public Target[] getTargets() {
        Target[] targetsArr = new Target[targets.size()];
        int i=0;
        for(Target target: targets)
        {
            targetsArr[i] = targets.get(i);
            i++;
        }
        return targetsArr;
    }
    public ArrayList<Target> identifyHotspots(ArrayList<Target> targets)
    {
        ArrayList<Target> filter= new ArrayList<>();
        for(Target target : targets)
        {
            if(target.isHotspot())
            {
                filter.add(target);
            }
        }
        return filter;
    }
    public void executeMissionOnHotspot(Target hotspot)
    {
        //Executes mission
    }
    public void assignRadar(RadarSystem radar)
    {
        this.radar=radar;
    }
}
