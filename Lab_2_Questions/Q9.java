package Lab_2_Questions;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String runs = "y";
        do{
            System.out.println("Enter marks for 5 subjects: ");
            float [] marks = new float[5];
            float sum =0;
            for (int i = 0; i < 5; i++) {
                System.out.print("Subject: " + (i+1)+": ");
                marks[i] = sc.nextFloat();
                System.out.println();
                sum += marks[i];
            }

            System.out.println("GRADE REPORT");
            System.out.println("Total Marks: "+sum);
            float per = sum/5;
            System.out.println("Percentage: "+per+"%");

            if(per>=80 && per<100){
                System.out.println("Grade: A");
            }
            else if(per>=70 && per<80){
                System.out.println("Grade: B");
            }
            else if(per>=60 && per<70){
                System.out.println("Grade: C");
            }
            else if(per>=50 && per<60){
                System.out.println("Grade: F");
            }
            else{
                System.out.println("ERROR!");
            }
            System.out.println("Generate another report? (Y/N)");
            runs = sc.next();
        }while(runs.equals("Y") || runs.equals("y"));
    }
}
