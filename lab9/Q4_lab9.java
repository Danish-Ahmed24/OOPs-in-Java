


package lab9;
class Registration {
    public Registration(String name,String category){
        System.out.println("Single Participant Registration:-> Name: "+name+" Category: "+category);
    }
    public Registration(String teamName,int noOfMembers,String competitionCategory)
    {
        System.out.println("Team Registration:-> Team Name: "+teamName+" Number of Members: "+noOfMembers+" Competition Category: "+competitionCategory);
    }
    public Registration(String uniName,int noOfParticipants)
    {
        System.out.println("Uni-wide bulk:-> Uni name: "+uniName+" Number of Participants: "+noOfParticipants);
    }
    public Registration(String name,String company,String expertise)
    {
        System.out.println("Industry Expert:-> Name: "+name+" Company: "+company+" Expertise: "+expertise);
    }
    public Registration(String name,float designation)
    {
        System.out.println("VIP guest:-> Name: "+name+" Designation"+designation);
    }
}
public class Q4_lab9{
    public static void main(String[] args) {
        Registration single = new Registration("Danish","CP");
        Registration team = new Registration("Goal Diggers",3,"CP");
        Registration uni = new Registration("Mehran University",145);
        Registration expert = new Registration("Sir Nadeem","Google","IOT");
        Registration VIP = new Registration("Sir Nadeem",5.0f);
    }
}