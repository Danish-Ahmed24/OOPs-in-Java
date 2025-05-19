package FloodReliefCampSystemFRCS;

import java.io.Serializable;

public abstract class Person implements Serializable {
    protected String name;
    protected int id;


    public Person(String name,int id)
    {
        this.name=name;
        this.id=id;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
