package FinalPractice2;

import java.util.ArrayList;

public class Country {
    private String name;
    private ArrayList<Road> roads;
    public Country(String name)
    {
        this.name=name;
        roads=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Road> getRoads() {
        return roads;
    }
    public void addRoad(Road r)
    {
        this.roads.add(r);
    }
    public int countStreets()
    {
        int i=0;
        for(Road r : roads)
        {
            if(r instanceof Street)
            {
                i++;
            }
        }
        return i;
    }
    public Street searchForStreet(String name)
    {
        for(Road r: roads)
        {
            if(r instanceof Street)
            {
                Street s = (Street) r;
                if(s.getName().equals(name))
                {
                    return s;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
