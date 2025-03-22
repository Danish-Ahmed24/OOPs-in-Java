package lab6;

import java.util.Scanner;

public class Q4_lab6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter M (Number of Students): ");
        int M = in.nextInt();
        System.out.println("Enter W (Number of Weeks): ");
        int W = in.nextInt();
        Attendance attendance = new Attendance(M, W);
        attendance.markAttendance();
        attendance.displayAttendanceSummary();
    }
}

class Attendance {
    Scanner in = new Scanner(System.in);
    int M, W;
    int[][] attendance;

    Attendance(int M, int W) {
        this.M = M;
        this.W = W;
        attendance = new int[M][W];
    }

    public void markAttendance() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < W; j++) {
                boolean validInput = false;
                while (!validInput) {
                    System.out.println("Mark attendance [1/0] for Student " + (i + 1) + " Week " + (j + 1) + ": ");
                    int temp = in.nextInt();
                    if (temp == 1 || temp == 0) {
                        attendance[i][j] = temp;
                        validInput = true;
                    } else {
                        System.out.println("ERROR: Please enter 1 (Present) or 0 (Absent). Try again.");
                    }
                }
            }
        }
    }

    public int calcTotalAttEachStd(int studentIndex) {
        int total = 0;
        for (int j = 0; j < W; j++) {
            total += attendance[studentIndex][j];
        }
        return total;
    }

    public int[] calcWeeklyAttendance() {
        int[] weeklyTotal = new int[W];
        for (int j = 0; j < W; j++) {
            for (int i = 0; i < M; i++) {
                weeklyTotal[j] += attendance[i][j];
            }
        }
        return weeklyTotal;
    }

    public double calcAverageAttendance() {
        int totalAttendance = 0;
        for (int i = 0; i < M; i++) {
            totalAttendance += calcTotalAttEachStd(i);
        }
        return (double) totalAttendance / (M * W) * 100;
    }

    public void displayAttendanceSummary() {
        System.out.println("\n--- Attendance Summary ---");

        // Total attendance for each student
        int bestStudent = 0, worstStudent = 0;
        int maxAttendance = 0, minAttendance = W;
        for (int i = 0; i < M; i++) {
            int total = calcTotalAttEachStd(i);
            System.out.println("Total attendance for Student " + (i + 1) + ": " + total);

            if (total > maxAttendance) {
                maxAttendance = total;
                bestStudent = i;
            }
            if (total < minAttendance) {
                minAttendance = total;
                worstStudent = i;
            }
        }

        // Weekly attendance
        int[] weeklyAttendance = calcWeeklyAttendance();
        for (int j = 0; j < W; j++) {
            System.out.println("Total attendance for Week " + (j + 1) + ": " + weeklyAttendance[j]);
        }

        // Average attendance
        System.out.printf("Average class attendance: %.2f%%\n", calcAverageAttendance());

        // Best and Worst attendance
        System.out.println("Student with Best Attendance: Student " + (bestStudent + 1) + " (" + maxAttendance + "/" + W + ")");
        System.out.println("Student with Worst Attendance: Student " + (worstStudent + 1) + " (" + minAttendance + "/" + W + ")");
    }
}
