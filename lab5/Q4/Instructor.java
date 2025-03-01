package Q4;

import java.util.ArrayList;

public class Instructor {
    private String name;
    private String department;
    private ArrayList<Course> courses;

    public Instructor(String name, String department) {
        this.name = name;
        this.department = department;
        this.courses = new ArrayList<>();
        Management.addInstructor(this);
    }
    public void teachCourse(Course c) {
        courses.add(c);
    }
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        for (int i =0 ; i<courses.size();i++) {
            System.out.println("Course: " + courses.get(i).getCourseName());
        }
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }
}
