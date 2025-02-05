package Lab_2_Questions;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("How many students do you wish to process grades for? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] grades = new int[n];
        int nF=0,nP=0,sum=0;
        float avg=0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
            sum+=grades[i];
            if(grades[i]>=60)
            {
                nP++;
            }
            else {
                nF++;
            }
            System.out.println();
        }
        avg = (float)sum/(grades.length);
        System.out.println("\n=============OUTPUT==============\n");
        System.out.println("*************Results*************");
        System.out.println("Total number of students: "+grades.length);
        System.out.println("Average grade: "+avg);
        System.out.println("Number of students who passed: "+nP);
        System.out.println("Number of students who failed: "+nF);
    }
}