package Q10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student studentManager = new Student();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            System.out.println("1. Enroll a Student");
            System.out.println("2. Display Enrolled Students");
            System.out.println("3. Remove a Student");
            System.out.println("4. Update Student Name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    studentManager.enroll();
                    break;
                case 2:
                    studentManager.displayStudents();
                    break;
                case 3:
                    studentManager.removeStudent();
                    break;
                case 4:
                    studentManager.updateName();
                    break;
                case 5:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);


    }
}
