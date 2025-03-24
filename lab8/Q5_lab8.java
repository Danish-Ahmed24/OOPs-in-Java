package lab8;

public class Q5_lab8 {
    public static void main(String[] args) {
    Event speedProgramming = new SpeedProgramming();
    speedProgramming.schedule();
    Event webDev = new WebDev();
    webDev.schedule();
    Event AI = new AIChallenge();
    AI.schedule();
    Event Cyber = new Cyber();
    Cyber.schedule();
    Event businessCase = new BusinessCase();
    businessCase.schedule();
    }
}

class Event{
    void schedule()
    {
        System.out.println("General Competition Schedule");
    }
}

class SpeedProgramming extends Event{
    @Override
    void schedule() {
        System.out.println("Speed Programming Competition Schedule");
    }
}

class WebDev extends Event{
    @Override
    void schedule() {
        System.out.println("Web Dev Competition Schedule");
    }
}

class AIChallenge extends Event{
    @Override
    void schedule() {
        System.out.println("AI Competition Schedule");
    }
}
class Cyber extends Event{
    @Override
    void schedule() {
        System.out.println("Cyber Competition Schedule");
    }
}
class BusinessCase extends Event{
    @Override
    void schedule() {
        System.out.println("Business Case Competition Schedule");
    }
}

