package Q9;

import java.util.Scanner;

public class Main_lab4_Q9 {
    public static void main(String[] args) {
        Project task1 = new Project();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the title of the task");
        String title = scanner.nextLine();
        System.out.println("Enter the task deadline");
        String deadline = scanner.nextLine();

        Project task2 = new Project(title, deadline);
        task2.showProjectInfo();

        System.out.println("Enter the estimated cost of the task");
        double cost = scanner.nextDouble();
        scanner.nextLine();

        task2 = new Project(title, deadline, cost);
        task2.showProjectInfo();

        System.out.println("Enter the title of another task");
        String newTitle = scanner.nextLine();
        System.out.println("Enter the deadline of this task");
        String newDeadline = scanner.nextLine();
        System.out.println("Enter the estimated cost of the task");
        double newCost = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the key feature of the task");
        String keyFeature = scanner.nextLine();

        AIProject task3 = new AIProject(newTitle, newDeadline, newCost, keyFeature);
        task3.showAIProjectInfo();

        System.out.println("The task " + task1.projectTitle + " is being deleted");
        System.out.println("The task " + task2.projectTitle + " is being deleted");
        System.out.println("The task " + task3.projectTitle + " is being deleted");

        task1 = null;
        task2 = null;
        task3 = null;
        System.gc();
    }
}
