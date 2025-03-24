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
        System.out.println("Speed Programming Competition Schedule: 10 am to 12 pm");
    }
}

class WebDev extends Event{
    @Override
    void schedule() {
        System.out.println("Web Dev Competition Schedule: 10 am to 6 pm");
    }
}

class AIChallenge extends Event{
    @Override
    void schedule() {
        System.out.println("AI Competition Schedule: 8 am to 12 pm");
    }
}
class Cyber extends Event{
    @Override
    void schedule() {
        System.out.println("Cyber Competition Schedule: 11 am to 5 pm");
    }
}
class BusinessCase extends Event{
    @Override
    void schedule() {
        System.out.println("Business Case Competition Schedule: 8 am to 5 pm");
    }
}

