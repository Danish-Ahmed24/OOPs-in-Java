package Lab_2_Questions;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees to evaluate: ");
        int n = sc.nextInt();
            String [] result = new String [n];
            double [] monthlySalary = new double [n];
            double [] attendancePercentage = new double [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ": ");
            System.out.println("Enter monthly salary: ");
            monthlySalary[i] = sc.nextDouble();
            System.out.println("Enter attendance percentage: ");
            attendancePercentage[i] = sc.nextDouble();
            if(monthlySalary[i] > 10000) {
                if(attendancePercentage[i]>90)
                    result[i] = "Outstanding";
                else if (attendancePercentage[i]>75 && attendancePercentage[i]<=90)
                    result[i] = "Satisfactory";
                else if(attendancePercentage[i]<75)
                    result[i] = "Needs improvement";
            }
            else if(monthlySalary[i]>5000 && monthlySalary[i]<=10000) {
                if(attendancePercentage[i]>80)
                    result[i] = "Satisfactory";
                else if (attendancePercentage[i]<=80){
                    result[i] = "Needs improvement";
                }
            }
            else {
                result[i] = "Needs improvement";
            }
            System.out.println("Result: " + result[i]);
        }

        System.out.println("\nFinal Report: ");
        System.out.println("+--------------------+--------------------+--------------------+");
        System.out.println("|\tEmployee Number\t|\tMonthly Sales\t|\tPerformance\t|");
        System.out.println("+--------------------+--------------------+--------------------+");
       for (int i = 0; i < n; i++) {
            System.out.println("| "+(i+1)+"\t\t\t\t| $"+monthlySalary[i]+"\t\t| "+result[i]+"\t\t|");
        }
//        System.out.println("+-------------------------+-------------------------+-------------------------+");
        System.out.println("+--------------------+--------------------+--------------------+");

    }
}
