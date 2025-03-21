package lab6;

import java.util.Scanner;

//You are tasked with creating a Student Attendance Management System using a two-dimensional array to track
//attendance records for students over several weeks. The system should store attendance data where each row
//represents a student and each column represents a week. For example, if there are M students and W weeks, the
//array will be of size M x W. The system should allow the user to input the attendance for each student in each week
//        (with 1 for present and 0 for absent). After storing the data,$$$$ the system should calculate and display the total
//attendance for each student, the weekly attendance across all students, and the average class attendance.
//Additionally, the system should identify students with the best and worst attendance records. This task illustrates
//the use of a two-dimensional array for managing attendance records and performing calculations across multiple
//dimensions of data.
public class Q4_lab6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter M : ");
        int M = in.nextInt();
        System.out.println("Enter W : ");
        int W = in.nextInt();
        Attendance attendance = new Attendance(M,W);
        attendance.markAttendance();
    }
}
class Attendance {
    Scanner in = new Scanner(System.in);
    int M,W,temp;
    boolean check;
    int [][]attendance;
    Attendance(int M,int W)
    {
        this.M=M;
        this.W=W;
        attendance = new int[M][W];
    }
    public void markAttendance()
    {
        for(int i =0 ; i<M ;i++)
        {
            check = true;
            for(int j =0; j<W ;j++)
            {
                check = true;
                while(check)
                {
                System.out.println("Mark attendance[1/0] ["+i+"]["+j+"] : ");
                temp=in.nextInt();
                if(temp==1 || temp ==0) {
                    attendance[i][j]=temp;
                    check = false;
                } else {
                    System.out.print("ERROR: ");
                }
                }
            }
        }
    }
}
