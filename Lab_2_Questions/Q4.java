package Lab_2_Questions;

import java.util.Scanner;
import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers between 1 and 100 (enter -1 to stop): ");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int temp,sumE=0,sumO=0;
        do
        {

            temp = sc.nextInt();
            numbers.add(temp);
            if(temp!=-1 && temp%2==0)
            {
                sumE+=temp;
            }
            else if (temp!=-1 && temp%2!=0)
            {
                sumO+=temp;
            }
        }while(temp!=-1);
        System.out.println("Sum of Even numbers: "+sumE);
        System.out.println("Sum of Odd numbers: "+sumO);
    }
}
