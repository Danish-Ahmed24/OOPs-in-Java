package Q10;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    Scanner in = new Scanner(System.in);
    static ArrayList<Student> studentsEnrollments = new ArrayList<>();
    String name;

    void enroll() {
        System.out.println("Enter Student Name: ");
        String studentName = in.nextLine();
        Student newStudent = new Student();
        newStudent.name = studentName;
        studentsEnrollments.add(newStudent);
        System.out.println(studentName + " has been enrolled!");
    }

    void displayStudents() {
        if (studentsEnrollments.isEmpty()) {
            System.out.println("No students enrolled.");
            return;
        }
        System.out.println("Enrolled Students:");
        for (int i = 0; i < studentsEnrollments.size(); i++) {
            System.out.println((i + 1) + " Name: " + studentsEnrollments.get(i).name);
        }
    }

    void removeStudent() {
        System.out.println("Enter your name to remove: ");
        String pName = in.nextLine();
        boolean found = false;

        for (int i = 0; i < studentsEnrollments.size(); i++) {
            if (studentsEnrollments.get(i).name.equals(pName)) {
                studentsEnrollments.remove(i);
                System.out.println(pName + " has been removed!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No match!");
        }
    }

    void updateName() {
        System.out.println("Enter your previous name: ");
        String pName = in.nextLine();
        boolean found = false;
        int index = -1;

        for (int i = 0; i < studentsEnrollments.size(); i++) {
            if (studentsEnrollments.get(i).name.equals(pName)) {
                index = i;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Enter new Name: ");
            studentsEnrollments.get(index).name = in.nextLine();
            System.out.println("Name updated successfully!");
        } else {
            System.out.println("No match!");
        }
    }


}
