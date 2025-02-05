package Lab_2_Questions;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "Y";
        do {
            System.out.println("Enter the titles of 5 books being borrowed: ");
            String [] titles = new String[5];
            for (int i = 0; i < 5; i++) {
                System.out.print("Book "+(i+1)+": ");
                titles[i] = sc.nextLine();
            }
            /// /////////////////////
            System.out.println("LIBRARY RECEIPT");
            System.out.println("Borrowed Books:");
            for (int i = 0; i < 5; i++) {
                System.out.println((i+1)+". "+titles[i]);
            }
            System.out.println("Fine Per Day (Overdue): $2.00");
            System.out.println("Continue for another user? (Y/N)");
            answer = sc.next();
        }while(answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("y"));

    }
}
