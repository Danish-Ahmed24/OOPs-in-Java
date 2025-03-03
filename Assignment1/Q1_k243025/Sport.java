package A2.Q1_k243025;
import java.util.ArrayList;

public class Sport {
    private int sportID;
    private String name;
    private String description;
    private ArrayList<Skill> requiredSkills;

    public Sport(int id,String name,String desp)
    {
        this.sportID=id;
        this.name =name;
        this.description=desp;
        this.requiredSkills = new ArrayList<>();
    }
    public void addSkill(Skill s)
    {
        this.requiredSkills.add(s);
        System.out.println("\nSkill Added Successfully!");
    }
    public void removeSkill(Skill s)
    {
        this.requiredSkills.remove(s);
        System.out.println("\nSkill removed Successfully!");
    }
    public void infoDisplay()
    {
        System.out.println(" "+this.name);
    }
}
