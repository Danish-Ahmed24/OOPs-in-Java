package FloodReliefCampSystemFRCS;

import java.io.*;
import java.util.ArrayList;

public class FamilyFileHandler  implements Serializable{
    public static void saveToFile(String fileName, ArrayList<Family> families){
        try{
            ArrayList<Family> current = loadFromFile(fileName);
            current.addAll(families);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(current);
            oos.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Family> loadFromFile(String fileName)
    {
        try
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            return (ArrayList<Family>) ois.readObject();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    public static void generateNeedsReport(String fileName, ArrayList<Family> families)
    {
        ArrayList<Family> load = loadFromFile("danish.dat");
        for(int i =0 ; i< load.size();i++){
            for (int j=1+i ; j<load.size();j++)
            {
                int ii =load.get(i).getNeeds().getClothing()+load.get(i).getNeeds().getFood()+load.get(i).getNeeds().getMedicine();
                int jj =load.get(j).getNeeds().getClothing()+load.get(j).getNeeds().getFood()+load.get(j).getNeeds().getMedicine();
                if(ii<jj)
                {
                    Family f = load.get(i);
                    load.set(i,load.get(j));
                    load.set(j,f);
                }
            }
        }
        System.out.println(load.get(0).getCampLocation());
        System.out.println(load.get(1).getCampLocation());
        System.out.println(load.get(2).getCampLocation());
        int i=0 , j=0;
        int temp = i;
        j =i;
        i=temp;
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);

        int temp1 = a.get(0);
        a.set(0,a.get(1));
        a.set(1,temp1);


    }
}
