package lab11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Q5_lab11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("Confidential.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
            System.exit(1);
        }

        System.out.print("Enter your designation (Faculty/Student): ");
        String designation = scanner.nextLine();

        if (designation.equalsIgnoreCase("Faculty")) {
            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(true);
        } else if (designation.equalsIgnoreCase("Student")) {
            file.setReadable(true);
            file.setWritable(false);
            file.setExecutable(false);
        } else {
            System.out.println("Invalid designation.");
            System.exit(0);
        }

        System.out.println("Access Rights:");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());

        scanner.close();
    }
}
