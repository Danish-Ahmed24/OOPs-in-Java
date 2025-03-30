package Assignment2;

import java.util.ArrayList;

class HashGenerator {
     public static int generateHash(String input) {
          int hash = 5381;
          for (char c : input.toCharArray()) {
               hash = (hash * 33) + c;
          }
          return hash;
     }
}

class User {
     protected String name;
     protected int id;
     protected ArrayList<String> permissions;
     protected String email;
     protected int hashed_password;

     public User(int id, String name, ArrayList<String> permissions, String email, String pass) {
          this.email = email;
          this.id = id;
          this.name = name;
          this.permissions = permissions;
          this.hashed_password = HashGenerator.generateHash(pass);
     }

     public boolean authenticate(String inputPassword) {
          return this.hashed_password == HashGenerator.generateHash(inputPassword);
     }

     public void displayInfo() {
          System.out.println("ID: " + this.id);
          System.out.println("Name: " + this.name);
          System.out.println("Email: " + this.email);
          System.out.println("Permissions: " + this.permissions);
          System.out.println("Hash Code: " + this.hashed_password);
     }
}

class Student extends User {
     private ArrayList<Integer> assignments;

     public Student(int id, String name, ArrayList<String> permissions, String email, String pass) {
          super(id, name, permissions, email, pass);
          this.assignments = new ArrayList<>();
     }

     public void submitAssignment(int index) {
          this.assignments.set(index, 1);
     }

     @Override
     public void displayInfo() {
          super.displayInfo();
          System.out.println("Assignments Status: " + this.assignments);
     }

     public void assignAssignment(int index) {
          while (this.assignments.size() <= index) {
               this.assignments.add(0);
          }
     }
}

class TA extends Student {
     private ArrayList<Student> students;
     private String[] projects;

     public TA(int id, String name, ArrayList<String> permissions, String email, String pass) {
          super(id, name, permissions, email, pass);
          this.students = new ArrayList<>();
          this.projects = new String[2];
     }

     public void viewProjects() {
          for (String project : projects) {
               if (project != null) {
                    System.out.println(project);
               }
          }
     }

     public void workOnNewProject(String project) {
          for (int i = 0; i < projects.length; i++) {
               if (projects[i] == null) {
                    projects[i] = project;
                    System.out.println("Assigned new project: " + project);
                    return;
               }
          }
          System.out.println("Can't exceed limit of 2 projects");
     }

     public void assignStudentToTA(Student student) {
          if (students.size() < 10) {
               students.add(student);
               System.out.println("Assigned student: " + student.name);
          } else {
               System.out.println("Cannot assign more than 10 students to a TA");
          }
     }

     @Override
     public void displayInfo() {
          super.displayInfo();
          System.out.println("Students assigned to this TA: ");
          for (Student student : students) {
               System.out.println(student.name);
          }
     }
}

class Professor extends User {
     private ArrayList<TA> tas;
     private ArrayList<String> projects;

     public Professor(int id, String name, ArrayList<String> permissions, String email, String pass) {
          super(id, name, permissions, email, pass);
          this.tas = new ArrayList<>();
          this.projects = new ArrayList<>();
     }

     public void assignProject(String project) {
          projects.add(project);
          System.out.println("Assigned new project: " + project);
     }

     public void assignTA(TA ta) {
          tas.add(ta);
          System.out.println("Assigned TA: " + ta.name);
     }

     public void workWithTAonProject(TA ta, String project) {
          if (tas.contains(ta)) {
               ta.workOnNewProject(project);
          } else {
               System.out.println("TA not assigned.");
          }
     }

     @Override
     public void displayInfo() {
          super.displayInfo();
          System.out.println("Assigned TAs: ");
          for (TA ta : tas) {
               System.out.println(ta.name);
          }
     }
}

public class A2_Q4_K243025 {

     public static void authenticateAndPerformAction(User user, String action) {
          if (action.equals("view lab")) {
               if (user.permissions.contains("view lab")) {
                    System.out.println(user.name + " is viewing the lab.");
               } else {
                    System.out.println(user.name + " does not have permission to view the lab.");
               }
          } else if (action.equals("submit assignment") && user instanceof Student) {
               ((Student) user).submitAssignment(0);
               System.out.println(user.name + " submitted an assignment.");
          } else if (action.equals("view projects") && user instanceof TA) {
               ((TA) user).viewProjects();
          } else {
               System.out.println("Action not permitted for this user.");
          }
     }

     public static void main(String[] args) {
          ArrayList<String> studentPermissions = new ArrayList<>();
          studentPermissions.add("submit assignment");

          ArrayList<String> taPermissions = new ArrayList<>();
          taPermissions.add("view projects");
          taPermissions.add("manage_students");

          ArrayList<String> professorPermissions = new ArrayList<>();
          professorPermissions.add("assign projects");
          professorPermissions.add("full_lab_access");

          Student student = new Student(1, "Danish", studentPermissions, "dan@ex.yyy", "password123");
          TA ta = new TA(2, "Ali", taPermissions, "ali@example.com", "password123");
          Professor professor = new Professor(3, "Rafay", professorPermissions, "y27@ff.com", "admin123");

          professor.assignProject("Research Project 1");
          professor.assignTA(ta);

          student.displayInfo();
          ta.displayInfo();
          professor.displayInfo();

          authenticateAndPerformAction(student, "submit assignment");
          authenticateAndPerformAction(ta, "view projects");
          authenticateAndPerformAction(professor, "assign projects");
     }
}
