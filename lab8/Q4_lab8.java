package lab8;

public class Q4_lab8 {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.register("Rafay");
        registration.register("Fast",230);
        registration.register("Human Beings","UI UX",3);
        registration.register("Danish","AI/ML");
    }
}
class Registration {
    void register(String name, String category)
    {
        System.out.println("Single Participant registered name: "+name+" Category: "+category);
    }
    void register(String teamName, String category,int noOfMembers)
    {
        System.out.println("Team registered name: "+teamName+" Category: "+category+" Members: "+noOfMembers);
    }
    void register(String uniName, int participants) {
        System.out.println("University-wide bulk registered name: " + uniName + " Category: " + participants);
    }
    void register(String name)
    {
        System.out.println("VIP guest registered name: "+name);
    }
}