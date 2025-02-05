package Q3;
import java.util.Scanner;
import java.util.ArrayList;


public class Company {

    Scanner in = new Scanner(System.in);
    String companyName,industryType,jobRole;
    boolean enrolled = false;
    ArrayList<String> requiredSkills = new ArrayList<String>();
    void scheduleInterview(Student student){
        System.out.println("Enter company Name: ");
        this.companyName= in.nextLine();
        System.out.println("Enter industryType: ");
        this.industryType=in.nextLine();
        System.out.println("Enter jobRole: ");
        this.jobRole=in.nextLine();
        Student skills = new Student();
        skills.skillsArrayList(requiredSkills);
            for (int i = 0 ; i< this.requiredSkills.size();i++){
                if(student.reqSkills.contains(this.requiredSkills.get(i))){
                    enrolled = true;
                }
            }
        if(enrolled){
            System.out.println("Enrolled!");
        }
        else{
            System.out.println("Skills not matched sorry !");
        }
    }
    void displayCompanyDetails(){
        System.out.println("Company: "+this.companyName);
        System.out.println("Industry Type: "+this.industryType);
        System.out.println("Job role: "+this.jobRole);
        System.out.println("Enrolled: "+enrolled);
//        companyName,industryType,jobRole
    }
}
class Student{
    Scanner in = new Scanner(System.in);
    void skillsArrayList(ArrayList<String> skills){
        System.out.println("Enter Skills and press -1 to stop: ");
        while (true) {
            String skill = in.next();
            if (skill.equals("-1")) {
                break;
            }
            skills.add(skill);
        }
    }
    String name;
    ArrayList<String> reqSkills = new ArrayList<String>();
    void createStudent(){
        System.out.println("Enter Name of Student: ");
        this.name=in.nextLine();
        skillsArrayList(reqSkills);
    }
}


//Design a Company class with attributes companyName, industryType, jobRole, and requiredSkills.
//Implement methods scheduleInterview (Student student) to assign an interview slot to a student and
//displayCompanyDetails() to show company information.
//Create objects for the following companies:
//         "Systems Limited", hiring Software Engineers, requiring skills in Java, Python, and SQL.
// "Folio3", hiring Data Analysts, requiring skills in Machine Learning, Python, and Power BI.
//Schedule interviews for students based on their skills and display company details.