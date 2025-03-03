package A2.Q1_k243025;

public class Skill {
    private int skillID;
    private String SkillName;
    private String description;

    public Skill(int id,String name,String desp)
    {
        this.skillID=id;
        this.SkillName=name;
        this.description=desp;
    }
    public void showSkillDetails()
    {
        System.out.println("\nSkill Details");
        System.out.println("ID: "+this.skillID);
        System.out.println("Name: "+this.SkillName);
        System.out.println("Description\n\t"+this.description);
    }
    public void updateSkillDescription(String newDescription)
    {
        this.description=newDescription;
        System.out.println("\nDescription updated successfully!");
    }
}
