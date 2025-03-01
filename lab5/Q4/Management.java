package Q4;

import java.util.ArrayList;

public class Management {
    static private ArrayList<Student>  students = new ArrayList<>();
    static private ArrayList<Course> courses = new ArrayList<>();
    static private ArrayList<Instructor>  instructors = new ArrayList<>();
    static public void addStudent(Student i)
    {
        students.add(i);
    }
    static public void addCourse(Course i)
    {
        courses.add(i);
    }
    static public void addInstructor(Instructor i)
    {
        instructors.add(i);
    }
    static public void showALlDetails()
    {
        System.out.println("\nStudent Details");
        for (Student i : students)
        {
            i.showDetails();
        }
        System.out.println("\nCourse Details");
        for(Course i : courses)
        {
            System.out.println("\nCourse Name: " + i.getCourseName());
        }
        System.out.println("\nInstructor Details");
        for(Instructor i : instructors)
        {
            i.showDetails();
        }
    }
}
