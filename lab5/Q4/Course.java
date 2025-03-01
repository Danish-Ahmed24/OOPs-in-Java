package Q4;

public class Course {
    private int courseID;
    private String courseName;
    private Instructor instructor;
    public Course(int courseID, String courseName) {
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
