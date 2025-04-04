package lab9;

class Task {
    protected String taskName;
    protected String assignee;

    public Task(String taskName, String assignee) {
        this.taskName = taskName;
        this.assignee = assignee;
    }
    public void assignTask() {
        System.out.println("Developer " + assignee + " is coding the task: " + taskName);
    }
}

class TaskWithPriority extends Task {
    protected int priority;

    public TaskWithPriority(String taskName, String assignee, int priority) {
        super(taskName, assignee);
        this.priority = priority;
    }
    @Override
    public void assignTask() {
        System.out.println(assignee + " is assigned task: " + taskName + " with priority: " + priority);
    }
}

class TaskWithEstTime extends TaskWithPriority {
    private int estTime;

    public TaskWithEstTime(String taskName, String assignee, int priority, int estTime) {
        super(taskName, assignee, priority);
        this.estTime = estTime;
    }
    @Override
    public void assignTask() {
        System.out.println(assignee + " is assigned task: " + taskName + " with priority: " + priority + " and estimated time: " + estTime + " hours.");
    }
}

class TeamLead extends Task {
    public TeamLead(String taskName, String assignee) {
        super(taskName, assignee);
    }
    @Override
    public void assignTask() {
        System.out.println("Team Lead " + assignee + " is reviewing and approving task: " + taskName);
    }
}

class ProjectManager extends Task {
    public ProjectManager(String taskName, String assignee) {
        super(taskName, assignee);
    }
    @Override
    public void assignTask() {
        System.out.println("Project Manager " + assignee + " has assigned an urgent task: " + taskName + " with custom deadline.");
    }
}

public class Q6_lab9 {
    public static void main(String[] args) {
        Task devTask = new Task("Bug Fixing", "Muhammad Nadeem Ghouri");
        TaskWithPriority devTaskPriority = new TaskWithPriority("Feature Development", "Muhammad Nadeem Ghouri", 2);
        TaskWithEstTime devTaskEstTime = new TaskWithEstTime("Refactoring", "Muhammad Nadeem Ghouri", 1, 5);
        Task teamLeadTask = new TeamLead("Code Review", "Minhal Raza");
        Task pmTask = new ProjectManager("Product Launch", "Muhammad Monis");

        devTask.assignTask();
        devTaskPriority.assignTask();
        devTaskEstTime.assignTask();
        teamLeadTask.assignTask();
        pmTask.assignTask();
    }
}
