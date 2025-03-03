package A2.Q1_k243025;
import java.util.ArrayList;
public class Mentor {
    private int mentorID;
    private String name;
    private ArrayList<Sport> sportsExpertise;
    private int maxLearners;
    private ArrayList<Student> assignedLearners;

    public Mentor(int id,String name, int maxLearners)
    {
        this.mentorID=id;
        this.name=name;
        this.maxLearners=maxLearners;
        this.sportsExpertise=new ArrayList<>();
        this.assignedLearners = new ArrayList<>(this.maxLearners);
    }

    public void assignLearner(Student s)
    {
        if(this.assignedLearners.size() < maxLearners)
        {
            this.assignedLearners.add(s);
            System.out.println("Learner Assigned Successfully!");
        }
        else
        {
            System.out.println("Sorry, Learners limit reached!");
        }
    }
    public void removeLearner(Student s){
        if(this.assignedLearners.size()>0)
        {
            this.assignedLearners.remove(s);
            System.out.println("Learner removed successfully!");
        }
        else {
            System.out.println("No learner is assigned!");
        }
    }
    public void viewLearners()
    {
        System.out.println("\t\t+++Learners+++");
        for(Student student : this.assignedLearners)
        {
            student.infoDisplay();
        }
    }
    public void provideGuidance(Student whom,String message)
    {
        whom.setGuidanceMessage(message);
    }
    public void infoDisplay()
    {
        System.out.println("Id: "+this.mentorID);
        System.out.println("Name: "+this.name);
        System.out.println("Expertise: "+this.sportsExpertise);
    }
}
