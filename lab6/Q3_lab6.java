package lab6;

import java.util.Scanner;

//You are tasked with creating a Student Grade Management System that uses a single-dimensional array to store the
//grades of students in a class. The system should allow the user to input the grades for N students and store them in
//a single-dimensional array. After storing the grades, the system should calculate and display the average grade of
//the class, the highest and lowest grades, and the number of students who scored above the class average. The system
//should also handle invalid grade inputs and prompt the user to re-enter valid grades if necessary. The goal of this
//task is to demonstrate how a single-dimensional array can be used to manage student grades and perform essential
//calculations based on the stored data.
public class Q3_lab6 {

    public static float avgCalc(int[] grades){
        int sum =0;
        for(int grade : grades)
        {
            sum+=grade;
        }
        return (float)sum/grades.length;
    }
    public static int highest(int[] grades)
    {
        int high = grades[0];
        for(int i=0;i<grades.length;i++)
        {
            if(grades[i]>high)
            {
                high=grades[i];
            }
        }
        return high;
    }
    public static int lowest(int[] grades)
    {
        int low = grades[0];
        for(int i=0;i<grades.length;i++)
        {
            if(grades[i]<low)
            {
                low=grades[i];
            }
        }
        return low;
    }
    public static int aboveAvg(int[] grades)
    {
        int n =0;
        float avg = avgCalc(grades);
        for(int grade : grades)
        {
            if(grade>avg)
            {
                n++;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int N,temp;
        boolean check;
        System.out.println("Enter N: ");
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        int []grades = new int[N];
        for(int i =0 ; i<grades.length;i++) {
            check = true;
            while (check) {
                System.out.println("Enter grade " + (i + 1) + " : ");
                temp = in.nextInt();
                if (temp >= 0 && temp <= 100) {
                    grades[i] = temp;
                    check = false;
                } else {
                    System.out.print("Invalid Input:  ");
                }
            }
        }
        System.out.println("Average: "+avgCalc(grades));
        System.out.println("Highest: "+highest(grades));
        System.out.println("Lowest: "+lowest(grades));
        System.out.println("Above Average: "+aboveAvg(grades));
    }
}

