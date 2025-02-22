package Q9;

public class Project {
    String projectTitle;
    String dueDate;
    double costEstimate;

    public Project(){
        this.projectTitle = "Untitled Project";
        this.dueDate = "No Due Date";
        this.costEstimate = 0.0;
        System.out.println("New Project Initialized");
        showProjectInfo();
    }

    public Project(String projectTitle, String dueDate){
        this.projectTitle = projectTitle;
        this.dueDate = dueDate;
    }

    public Project(String projectTitle, String dueDate, double costEstimate){
        this(projectTitle, dueDate);
        this.costEstimate = costEstimate;
    }

    public void showProjectInfo(){
        System.out.println("\nProject Title: " + this.projectTitle + "\nDue Date: " + this.dueDate + "\nEstimated Cost: $" + this.costEstimate);
    }
}

class AIProject extends Project{
    String keyFeature;

    AIProject(String projectTitle, String dueDate, double costEstimate, String keyFeature){
        super(projectTitle, dueDate, costEstimate);
        this.keyFeature = keyFeature;
    }

    public void showAIProjectInfo() {
        super.showProjectInfo();
        System.out.println("Key Feature: " + this.keyFeature);
    }
}
