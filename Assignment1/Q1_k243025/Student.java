package A2.Q1_k243025;
import java.util.ArrayList;
public class Student {
    private int studentID;
    private String name;
    private int age;
    private ArrayList<Sport> sportInterest;
    private Mentor mentorAssigned;
    private String guidanceMessage;

    public Student(int id , String name, int age)
    {
        this.studentID=id;
        this.name=name;
        this.age=age;
        this.sportInterest=new ArrayList<>();
        this.guidanceMessage="";
    }
    public void registerForMentorship(Mentor m)
    {
        this.mentorAssigned=m;
        System.out.println("\nMentor Assigned Successfully!");
    }

    public void viewMentorDetails()
    {
        this.mentorAssigned.infoDisplay();
    }

    public void updateSportsInterest(Sport s)
    {
        this.sportInterest.add(s);
        System.out.println("\nSport Interest Updated Successfully!");
    }

    public void infoDisplay()
    {
        System.out.println("Id: "+this.studentID);
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Sport Interest: ");
        for (Sport sport : this.sportInterest)
        {
            sport.infoDisplay();
        }
        System.out.println("Guidance Message: "+this.guidanceMessage);
    }

    public void setGuidanceMessage(String guidanceMessage) {
        this.guidanceMessage = guidanceMessage;
    }
}
