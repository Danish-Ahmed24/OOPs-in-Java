package Lab_2_Questions;

import java.util.Scanner;

public class Q3
{
    public static void main(String[] args) {
        char stopper = 'n';
        do {
            System.out.println("********************************************");
            System.out.println("\t\t\t\tINVOICE\t\t");
            System.out.println("********************************************");
            System.out.println("Itemized List:");
            String [] items = new String[5];
            float [] itemsPrice = new float[5];
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < items.length; i++){
                System.out.print("Enter item " + (i + 1) + ": ");
                items[i] = input.next();
                System.out.print("Enter item price " + (i + 1) + ": ");
                itemsPrice[i] = input.nextFloat();
            }
            for (int i = 0; i < items.length; i++){
                System.out.println((i + 1)+". "+items[i]+"\t"+itemsPrice[i]);
            }
            System.out.println("--------------------------------------------");
            float total = 0;
            for (int i = 0; i < items.length; i++){
                total += itemsPrice[i];
            }
            System.out.println("SubTotal\t\t\t"+total);
            System.out.println("Discount Percent: \t\t\t 10%");
            float Discount = total*0.1f;
            System.out.println("Discount Amount: \t\t\t"+Discount);
            System.out.println("--------------------------------------------");
            System.out.println("Total Before Tax: \t\t\t"+(total-Discount));
            float salesTax = (total-Discount)*0.05f;
            System.out.println("Sales Tex (5%): \t\t\t"+salesTax);
            System.out.println("--------------------------------------------");
            System.out.println("Invoice Total: \t\t\t"+(total-Discount+salesTax));
            System.out.println("********************************************");
            System.out.println("Thank you for shopping with us!");
            System.out.println("********************************************");
            System.out.println("\nContinue (y/n): ");
            stopper = input.next().charAt(1);

        }while (stopper == 'y');
    }
}
