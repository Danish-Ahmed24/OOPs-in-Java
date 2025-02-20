package Q7;

import java.util.ArrayList;

public class Project {
    static ArrayList<Project> projects = new ArrayList<Project>();
    String projectName;
    String deadLine;
    float budget;
    Project(String projectName, String deadLine, float budget) {
        this.projectName = projectName;
        this.deadLine = deadLine;
        this.budget = budget;
        projects.add(this);
        System.out.println("Project Created: "+this.projectName+", Deadline: "+this.deadLine+", Budget: $"+this.budget);
    }
    Project(String projectName, String deadLine) {
        this.projectName = projectName;
        this.deadLine = deadLine;
        this.budget = 0.0f;
        projects.add(this);
        System.out.println("Project Created: "+this.projectName+", Deadline: "+this.deadLine);
    }
    Project(){
        this.deadLine = "Not Assigned";
        this.budget = 0.0f;
        this.projectName = "Untitled Project";
        projects.add(this);
        System.out.println("Default Project Created: "+this.projectName+", Deadline: "+this.deadLine+", Budget: $"+this.budget);
    }
}
