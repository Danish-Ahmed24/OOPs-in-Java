package Q7;

public class Person_Q7 {
    protected String nm;
    protected int ag;

    public Person_Q7(String nm, int ag) {
        this.nm = nm;
        this.ag = ag;
    }

    public void dspInfo() {
        System.out.println("Nm: " + nm);
        System.out.println("Ag: " + ag);
    }
}

class Dept {
    private String dptNm;
    private String loc;

    public Dept(String dptNm, String loc) {
        this.dptNm = dptNm;
        this.loc = loc;
    }

    public void dspInfo() {
        System.out.println("Dpt: " + dptNm);
        System.out.println("Loc: " + loc);
    }
}

class Doc extends Person_Q7 {
    private String spcl;
    private String did;
    private Dept dpt;

    public Doc(String nm, int ag, String spcl, String did, Dept dpt) {
        super(nm, ag);
        this.spcl = spcl;
        this.did = did;
        this.dpt = dpt;
    }

    public void dspInfo() {
        super.dspInfo();
        System.out.println("DID: " + did);
        System.out.println("Spcl: " + spcl);
        dpt.dspInfo();
    }
}

class Pat extends Person_Q7 {
    private String pid;
    private String dis;
    private Doc doc;

    public Pat(String nm, int ag, String pid, String dis, Doc doc) {
        super(nm, ag);
        this.pid = pid;
        this.dis = dis;
        this.doc = doc;
    }

    public void dspInfo() {
        super.dspInfo();
        System.out.println("PID: " + pid);
        System.out.println("Dis: " + dis);
        System.out.println("Doc: " + doc.nm);
    }
}

class HospMngSys {
    public static void main(String[] args) {
        Dept crd = new Dept("Cardio", "Bld A");
        Doc d1 = new Doc("Dr. Smth", 45, "Cardio", "D101", crd);
        Pat p1 = new Pat("Jhn", 30, "P201", "Hrt Dis", d1);

        System.out.println("--- Doc Info ---");
        d1.dspInfo();

        System.out.println("\n--- Pat Info ---");
        p1.dspInfo();
    }
}

