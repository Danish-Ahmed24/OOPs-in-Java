package Question1;

public class JavaCourse extends Course {
    String TeacherName;
    JavaCourse(String name,String code,String venue,int chours,String cname)
    {
        super(name,code,venue,chours);
        this.TeacherName=cname;
    }

    void display()
    {
        System.out.println("Course Name: "+courseName);
        System.out.println("Course Code "+ courseCode);
        System.out.println("Class Venue "+classVenue);
        System.out.println("Credit Hours "+creditHours);
        System.out.println("Teacher name: "+TeacherName);
    }
}