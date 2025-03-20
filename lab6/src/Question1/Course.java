package Question1;

public class Course {

    protected String courseName;
    protected String courseCode;
    protected String classVenue;
    protected int creditHours;

    Course(String name,String code,String venue,int chours)
    {
        this.courseName = name;
        this.courseCode = code;
        this.classVenue = venue;
        this.creditHours = chours;
    }
}
