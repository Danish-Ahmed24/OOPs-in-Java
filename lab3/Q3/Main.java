package Q3;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.createStudent();

        Company c1 = new Company();
        c1.scheduleInterview(s1);
        c1.displayCompanyDetails();

        Student s2 = new Student();
        s2.createStudent();


        Company c2 = new Company();
        c2.scheduleInterview(s2);
        c2.displayCompanyDetails();

    }
}
