package Q4;

import java.util.ArrayList;

public class Student {
    private ArrayList<Course> courses;
    private String name;
    private int rollNo;
    private String program;
    public Student(String name, int rollNo, String program) {
        this.name = name;
        this.rollNo = rollNo;
        this.program = program;
        courses = new ArrayList<>();
        Management.addStudent(this);
    }
    public void learnCourse(Course course) {
        courses.add(course);
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void showDetails() {
        System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Program: " + program);
        System.out.println("Enrolled in Courses:");
        for (Course c : courses) {
            System.out.println(c.getCourseName());
        }
    }

}
