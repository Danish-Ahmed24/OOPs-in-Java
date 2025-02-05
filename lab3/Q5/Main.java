package Q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Item a = new Item();
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("1. Add product");
            System.out.println("2. Search by name");
            System.out.println("3. Search by id");

            System.out.println("4. exit");
            System.out.println("Enter");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    a.addProducts();
                    break;
                case 2:
                    a.searchByName();
                    break;
                case 3:
                    a.searchById();
                    break;
                case 4: break;
                default:
                    System.out.println("Invalid");
            }
        }while(choice!=4);
    }
}
