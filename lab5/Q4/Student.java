package Q4;

import java.util.ArrayList;

public class Student {
    private ArrayList<Course_lab5_Q4> cours;
    private String name;
    private int rollNo;
    private String program;
    public Student(String name, int rollNo, String program) {
        this.name = name;
        this.rollNo = rollNo;
        this.program = program;
        cours = new ArrayList<>();
        Management.addStudent(this);
    }
    public void learnCourse(Course_lab5_Q4 courseLab5Q4) {
        cours.add(courseLab5Q4);
    }
    public ArrayList<Course_lab5_Q4> getCourses() {
        return cours;
    }

    public void showDetails() {
        System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Program: " + program);
        System.out.println("Enrolled in Courses:");
        for (Course_lab5_Q4 c : cours) {
            System.out.println(c.getCourseName());
        }
    }

}
