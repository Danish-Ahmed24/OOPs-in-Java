package lab9;

class Emp {
    protected String name;
    protected int id;

    public Emp(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void evalPerf() {
        System.out.println("Evaluating performance for: " + name);
    }
    public void evalPerf(String crit) {
        System.out.println("Evaluating performance for: " + name + " with additional criteria: " + crit);
    }
}

class JrDev extends Emp {
    private int projDone;
    private double codeScore;

    public JrDev(String name, int id, int projDone, double codeScore) {
        super(name, id);
        this.projDone = projDone;
        this.codeScore = codeScore;
    }

    @Override
    public void evalPerf() {
        System.out.println("Evaluating performance for Junior Developer: " + name);
        System.out.println("Completed Projects: " + projDone);
        System.out.println("Code Quality Score: " + codeScore);
    }
}

class SrDev extends Emp {
    private int teamContrib;
    private int mentorActs;
    private int techLeadScore;

    public SrDev(String name, int id, int teamContrib, int mentorActs, int techLeadScore) {
        super(name, id);
        this.teamContrib = teamContrib;
        this.mentorActs = mentorActs;
        this.techLeadScore = techLeadScore;
    }

    @Override
    public void evalPerf() {
        System.out.println("Evaluating performance for Senior Developer: " + name);
        System.out.println("Team Contributions: " + teamContrib);
        System.out.println("Mentorship Activities: " + mentorActs);
        System.out.println("Technical Leadership Score: " + techLeadScore);
    }
}

class ProjMgr extends Emp {
    private int projSuccess;
    private int budgetAdhr;
    private int teamEff;

    public ProjMgr(String name, int id, int projSuccess, int budgetAdhr, int teamEff) {
        super(name, id);
        this.projSuccess = projSuccess;
        this.budgetAdhr = budgetAdhr;
        this.teamEff = teamEff;
    }

    @Override
    public void evalPerf() {
        System.out.println("Evaluating performance for Project Manager: " + name);
        System.out.println("Project Success Rate: " + projSuccess);
        System.out.println("Budget Adherence: " + budgetAdhr);
        System.out.println("Team Efficiency Score: " + teamEff);
    }
}

class EmpAddCrit extends Emp {
    private int innovScore;
    private String clientFb;

    public EmpAddCrit(String name, int id, int innovScore, String clientFb) {
        super(name, id);
        this.innovScore = innovScore;
        this.clientFb = clientFb;
    }

    @Override
    public void evalPerf() {
        System.out.println("Evaluating performance for Employee with Additional Criteria: " + name);
        System.out.println("Innovation Score: " + innovScore);
        System.out.println("Client Feedback: " + clientFb);
    }

    public void evalPerf(String crit) {
        System.out.println("Evaluating performance for promotion candidate: " + name);
        System.out.println("Leadership Evaluation Criteria: " + crit);
    }
}

public class Q7_lab9 {
    public static void main(String[] args) {
        Emp jrDev = new JrDev("Minhal Raza", 1, 5, 4.7);
        Emp srDev = new SrDev("Nadeem Khan", 2, 15, 10, 9);
        Emp projMgr = new ProjMgr("Monis Khan", 3, 95, 90, 85);

        Emp empAddCrit = new EmpAddCrit("Iqra Fahad", 4, 8, "Excellent client feedback");

        jrDev.evalPerf();
        srDev.evalPerf();
        projMgr.evalPerf();

        empAddCrit.evalPerf();
        ((EmpAddCrit) empAddCrit).evalPerf("Leadership Skills for Promotion");
    }
}