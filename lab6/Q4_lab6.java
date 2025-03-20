package lab6;

import java.util.Scanner;

//You are tasked with creating a Student Attendance Management System using a two-dimensional array to track
//attendance records for students over several weeks. The system should store attendance data where each row
//represents a student and each column represents a week. For example, if there are M students and W weeks, the
//array will be of size M x W. The system should allow the user to input the attendance for each student in each week
//        (with 1 for present and 0 for absent). After storing the data, the system should calculate and display the total
//attendance for each student, the weekly attendance across all students, and the average class attendance.
//Additionally, the system should identify students with the best and worst attendance records. This task illustrates
//the use of a two-dimensional array for managing attendance records and performing calculations across multiple
//dimensions of data.
public class Q4_lab6 {

}
class Attendance {
    Scanner in = new Scanner(System.in);
    int M,W,temp;
    int [][]attendance;
    Attendance(int M,int W)
    {
        attendance = new int[M][W];
    }
    public void markAttendance()
    {
        for(int[] M : attendance)
        {
            for(int W : M)
            {
                System.out.println("Mark attendance[1/0]: ");
                temp=in.nextInt();

            }
        }
    }
}
