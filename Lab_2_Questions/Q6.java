package Lab_2_Questions;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args)
    {
        String username = "Danish";
        String password = "abc123";
        double amount = 100.00;
        System.out.println("Enter Username: ");
        Scanner sc = new Scanner(System.in);
        String userCheck = sc.nextLine();
        System.out.println("Enter Password: ");
        String passCheck = sc.nextLine();
        if(userCheck.equals(username) && passCheck.equals(password)){
            System.out.println("Login Successful! Welcome, "+username+"!");
            System.out.println("****************************************************");
            //-----------------------------
            boolean run = true;
            do {
                System.out.println("\t\t\t\tWelcome to Bank of Pakistan!");
                System.out.println("****************************************************");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Account Status");
                System.out.println("****************************************************");
                System.out.println("Select an option: ");
                int option = sc.nextInt();
                switch(option){
                    case 1:
                        System.out.println("Enter the amount to deposit: ");
                        double depositedAmount = sc.nextDouble();
                        amount+=depositedAmount;
                        System.out.println("Amount deposited successfully. New balance: "+amount );
                        break;
                    case 2:
                        System.out.println("Enter the amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        amount-=withdrawAmount;
                        System.out.println("Amount withdrawn successfully. New balance: "+amount );
                        break;
                    case 3:
                        System.out.println("Account status: ");
                        System.out.println("Username: "+username);
                        System.out.println("Current balance: "+amount);

                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
                System.out.println("Do you want to continue (Y/y): ");
                String answer = sc.next();
                if(!(answer.equals("y") || answer.equals("Y"))){
                    run = false;
                }
            }while (run);
        }
        else{
            System.out.println("Login Failed. Try again :( ");
        }
        System.out.println("Thank you for banking with us!. Goodbye!");
    }
}
