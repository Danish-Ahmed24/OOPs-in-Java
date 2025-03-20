package Q4;

import java.util.ArrayList;

public class Instructor {
    private String name;
    private String department;
    private ArrayList<Course_lab5_Q4> cours;

    public Instructor(String name, String department) {
        this.name = name;
        this.department = department;
        this.cours = new ArrayList<>();
        Management.addInstructor(this);
    }
    public void teachCourse(Course_lab5_Q4 c) {
        cours.add(c);
    }
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        for (int i = 0; i< cours.size(); i++) {
            System.out.println("Course: " + cours.get(i).getCourseName());
        }
    }
    public ArrayList<Course_lab5_Q4> getCourses() {
        return cours;
    }
}
