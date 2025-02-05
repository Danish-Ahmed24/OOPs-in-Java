package Q8;

import java.util.ArrayList;
import java.util.Scanner;

public class Karachi {
    void initialTemperature(){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Temperatures you want to enter: ");
        n=in.nextInt();
        float [] initialTemps = new float[n];
        float [] finalTemps = new float[n];
        System.out.print("Enter Initial Temperatures: ");
        for (int i = 0 ; i<initialTemps.length;i++){
            initialTemps[i]=in.nextFloat();

            finalTemps[i]+=initialTemps[i]+2;
        }
        System.out.println("\nOriginal Temperature in Karachi: ");
        for (int i = 0 ; i< initialTemps.length;i++)
        {
            System.out.print(" "+initialTemps[i]+" ");
        }
        System.out.println("\n");

        System.out.println("\nAdjusted Temperature in Karachi: ");
        for (int i = 0 ; i< finalTemps.length;i++)
        {
            System.out.print(" "+finalTemps[i]+" ");
        }
        System.out.println("\n");

    }
}
