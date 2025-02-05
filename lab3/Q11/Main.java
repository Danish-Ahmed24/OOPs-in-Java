package Q11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GymMember gymManager = new GymMember();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            System.out.println("1. Register a New Member");
            System.out.println("2. Display Active Members");
            System.out.println("3. Remove a Member");
            System.out.println("4. Update Member Name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    gymManager.registerMember();
                    break;
                case 2:
                    gymManager.displayMembers();
                    break;
                case 3:
                    gymManager.removeMember();
                    break;
                case 4:
                    gymManager.updateMemberName();
                    break;
                case 5:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

    }}
