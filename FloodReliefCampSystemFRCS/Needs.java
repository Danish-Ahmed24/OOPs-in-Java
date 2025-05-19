package FloodReliefCampSystemFRCS;

import java.io.Serializable;

public class Needs implements Serializable {
    private int food,medicine,clothing;
    public Needs(int f,int m,int c)
    {
        this.food=f;
        this.medicine=m;
        this.clothing=c;
    }
    public void updateNeeds(int food)
    {
        this.food=food;
    }
    public void updateNeeds(int food,int medicine)
    {
        this.food=food;
        this.medicine=medicine;
    }
    public void updateNeeds(int food,int medicine,int clothing)
    {
        this.food=food;
        this.medicine=medicine;
        this.clothing=clothing;
    }








    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getMedicine() {
        return medicine;
    }

    public void setMedicine(int medicine) {
        this.medicine = medicine;
    }

    public int getClothing() {
        return clothing;
    }

    public void setClothing(int clothing) {
        this.clothing = clothing;
    }
}
