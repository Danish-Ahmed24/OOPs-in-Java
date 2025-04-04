package lab9;
class Event{
    public void schedule(){
        System.out.println("Timing: 12pm t0 9 pm");
    }
}
class SpeedProgramming extends Event{
    private int rounds;
    public SpeedProgramming(int rounds){this.rounds=rounds;}
    @Override
    public void schedule() {
        System.out.println("Speed Programming:-> "+rounds+", on the spot debugging session: 9am to 10 am");
    }
}
class WebDevelopment extends Event{
    @Override
    public void schedule() {
        System.out.println("Web Development:-> Presentation session:9pm , live demo: 8am");
    }
}
class AIChallenge extends Event{
    @Override
    public void schedule() {
        System.out.println("AI challenge:-> Problem Solving phase : 9pm , Ai model evalautipn : 8am");
    }
}
class CyberSecurity extends Event{
    @Override
    public void schedule() {
        System.out.println("Cyber Security:-> CTF-style hacking rounds: 7am, vulnerability assessments: 3pm");
    }
}
class BusinessCase extends Event{
    @Override
    public void schedule() {
        System.out.println("Business Case:-> market analysis : 5pm , strategy development: 4pm,pitch presentations: 2pm");
    }
}
public class Q5_lab9 {
    public static void main(String[] args) {
        Event sp = new SpeedProgramming(2);
        Event wd = new WebDevelopment();
        Event ai = new AIChallenge();
        Event cys = new CyberSecurity();
        Event business = new BusinessCase();
        sp.schedule();
        wd.schedule();
        ai.schedule();
        cys.schedule();
        business.schedule();
    }
}
