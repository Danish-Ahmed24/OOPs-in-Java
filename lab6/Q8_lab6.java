package lab6;

class Project {
    private final String projectDeadline;
    private static int totalProjects = 0;

    public Project(String projectDeadline) {
        this.projectDeadline = projectDeadline;
        totalProjects++;
    }

    public void display() {
        System.out.println("Project Deadline: " + projectDeadline);
    }

    public static void displayTotalProjects() {
        System.out.println("Total Projects: " + totalProjects);
    }
}

public class Q8_lab6 {
    public static void main(String[] args) {
        Project p1 = new Project("2025-06-30");
        Project p2 = new Project("2025-07-15");
        Project p3 = new Project("2025-08-01");

        p1.display();
        p2.display();
        p3.display();

        Project.displayTotalProjects();
    }
}

