package Q9;

import java.util.Scanner;

public class Store {
    void discount(){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of products: ");
        n = in.nextInt();
        int [] originalPrices = new int[n];
        int [] discountedPrices = new int[n];
        System.out.print("Original Prices: ");
        for (int i =0;i<n;i++)
        {
            originalPrices[i]=in.nextInt();
            discountedPrices[i]+=(originalPrices[i]*0.1f);
        }

        System.out.print("Discounted Prices: ");
        for (int i =0;i<n;i++)
        {
            System.out.print(" "+discountedPrices[i]+" ");
        }
        }
}
