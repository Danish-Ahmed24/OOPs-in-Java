package Lab_2_Questions;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String run = "y";
        do{
            System.out.println("Enter items (first item's name and then price): ");
            String [] names = new String[5];
            double [] prices = new double[5];
            for (int i = 0; i < 5; i++) {
                names[i]= sc.next();
                prices[i]= sc.nextDouble();
            }

            System.out.println("SHOPPING RECEIPT");
            double total = 0;
            for(double a:prices)
            {
                total+=a;
            }
            System.out.println("Subtotal: $"+total);
            double discount = 5;
            if(total>500)
            {
                discount=10;
            }
            System.out.println("Discount: "+discount);
            System.out.println("Discount amount: $"+(discount*total/100));
            System.out.println("Total amount after discount: $"+(total-(discount*total/100)));
            System.out.println("Generate another receipt? (y/n) ");
            run = sc.next();
        }while(run.equals("y") || run.equals("Y"));
    }
}
