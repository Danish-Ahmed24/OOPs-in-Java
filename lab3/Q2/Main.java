package Q2;

public class Main {
    public static void main(String[] args)
    {
        Session s1 = new Session();
        s1.scheduleSession();;
        s1.displaySessionDetails();

        Session s2 = new Session();
        s2.scheduleSession();;
        s2.displaySessionDetails();
    }
}