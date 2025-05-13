package Quiz3_Airforce;

import java.io.*;
import java.util.ArrayList;

public class MissionLogger implements Serializable {
    public void saveMissionsToFile(ArrayList<AirStrikeMission> missions,String fileName)
    {
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(missions);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public ArrayList<AirStrikeMission> readMissionsFromFile(String fileName)
    {
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            return (ArrayList<AirStrikeMission>) ois.readObject();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }
    public void saveHotspots(Target[] hotspots,String fileName)
    {
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(hotspots);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public ArrayList<Target> loadTargetsAndFilterHotspots(String fileName)
    {
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            Target[] nonfilter = (Target[]) ois.readObject();
            ArrayList<Target> filter = new ArrayList<>();
            for(Target target:nonfilter)
            {
                if(target.isHotspot())
                {
                    filter.add(target);
                }
            }
            return filter;
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }
}
