package Q4;

public class Course_lab5_Q4 {
    private int courseID;
    private String courseName;
    private Instructor instructor;
    public Course_lab5_Q4(int courseID, String courseName) {
        this.courseID = courseID;
        this.courseName = courseName;
        Management.addCourse(this);
    }

    public int getCourseID() {
        return courseID;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

}
