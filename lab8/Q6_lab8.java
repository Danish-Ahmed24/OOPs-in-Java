package lab8;

public class Q6_lab8 {
    public static void main(String[] args) {
        Developers SE = new SoftwareEngineer();
        SE.assignTask("Fixing","12 june");
        Developers TL = new TeamLead();
        TL.assignTask("Refactoring","12 july","4");
        Developers PM = new ProjectManager();
        PM.assignTask("Code Review","6 dec","5","5 days");
    }
}
class Developers{
    public void assignTask(String taskName,String deadLine)
    {
        System.out.println("Developer assigned : "+taskName+" Deadline: "+deadLine);
    }
    public void assignTask(String taskName,String deadLine,String priorityLevel)
    {
        System.out.println("Developer assigned: "+taskName+" Deadline: "+deadLine+" priorityLevel: "+priorityLevel);
    }
    public void assignTask(String taskName,String deadLine,String priorityLevel,String timeEstimated)
    {
        System.out.println("Developer assigned: "+taskName+" Deadline: "+deadLine+" PriorityLevel: "+priorityLevel+" Time Estimated: "+timeEstimated);
    }
}

class SoftwareEngineer extends Developers{
    @Override
    public void assignTask(String taskName, String deadLine) {
        System.out.println("Software Engineer assigned : "+taskName+" Deadline: "+deadLine);
    }
}
class TeamLead extends Developers{
    @Override
    public void assignTask(String taskName, String deadLine, String priorityLevel) {
        System.out.println("Team Lead assigned: "+taskName+" Deadline: "+deadLine+" priorityLevel: "+priorityLevel);
    }
}
class ProjectManager extends Developers{
    @Override
    public void assignTask(String taskName, String deadLine, String priorityLevel, String timeEstimated) {
        System.out.println("Project Manager assigned: "+taskName+" Deadline: "+deadLine+" PriorityLevel: "+priorityLevel+" Time Estimated: "+timeEstimated);
    }
}
// I have used overloading in assignTask method in Developers class because it requires multiple arguments , and i have used
// overriding in particular classes like SoftwareEngineer , Teamlead , and ProjectManager becuase they require different function
// for assigning roles