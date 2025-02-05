package Lab_2_Questions;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8};
        int max = numbers[0];
        for (int i =1; i < numbers.length; i++) {
            if(max<numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println("The maximum value in the array is: "+max);
    }
}
