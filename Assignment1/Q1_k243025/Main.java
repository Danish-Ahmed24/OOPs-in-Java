package A2.Q1_k243025;

public class Main {
    public static void main(String[] args) {
        // Skills banao
        Skill skill1 = new Skill(101, "Dribbling", "Ball ko move karte waqt control karne ki skill");
        Skill skill2 = new Skill(102, "Serving", "Tennis ka acha serve maarne ki skill");

        // Sports banao
        Sport football = new Sport(201, "Football", "Ek team sport jo gol ball se khela jata hai");
        Sport tennis = new Sport(202, "Tennis", "Ek racket sport jo single ya doubles mein khela jata hai");

        // Skills ko sports mein dalo
        football.addSkill(skill1);
        tennis.addSkill(skill2);

        // Mentor banao
        Mentor mentorAli = new Mentor(301, "Ali", 3);

        // Students banao
        Student studentSaad = new Student(401, "Saad", 20);
        Student studentAhmed = new Student(402, "Ahmed", 21);
        Student studentZain = new Student(403, "Zain", 22);
        Student studentOmar = new Student(404, "Omar", 23); // Extra student capacity check karne ke liye

        // Students ko mentorship keleye register karo
        studentSaad.registerForMentorship(mentorAli);
        studentAhmed.registerForMentorship(mentorAli);
        studentZain.registerForMentorship(mentorAli);
        studentOmar.registerForMentorship(mentorAli); // Yeh fail hoga kyunki jagah full ho gayi hai

        // Students ko mentor do
        mentorAli.assignLearner(studentSaad);
        mentorAli.assignLearner(studentAhmed);
        mentorAli.assignLearner(studentZain);
        mentorAli.assignLearner(studentOmar); // Yeh fail hoga kyunki max learners ka limit cross ho gaya hai

        // Assigned learners check karo
        mentorAli.viewLearners();

        // Student ko guidance do
        mentorAli.provideGuidance(studentSaad, "Rozana dribbling ki practice karo!");

        // Mentor ki details dekho
        studentSaad.viewMentorDetails();

        // Student ka sports interest update karo
        studentSaad.updateSportsInterest(football);

        // Student ki details dekho
        studentSaad.infoDisplay();

        // Learner ko hatao
        mentorAli.removeLearner(studentZain);

        // Ek naye student ko add karne ki koshish karo jab aik slot free ho gaya ho
        mentorAli.assignLearner(studentOmar);

        // Akhri dafa assigned learners check karo
        mentorAli.viewLearners();
    }
}
