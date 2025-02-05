package Q1;

import java.util.Scanner;

public class Stadium {
    String name, city;

    int matchesScheduled,capacity;
    void scheduleMatch(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of Stadium: ");
        this.name=in.nextLine();
        System.out.println("Enter the name of city: ");
        this.city=in.nextLine();
        System.out.println("Enter the capacity: ");
        this.capacity=in.nextInt();
        System.out.println("Enter number of matches to scheduled: ");
        this.matchesScheduled=in.nextInt();
    }
    void displayDetails(){
        System.out.println("\n\nStadium: "+this.name);
        System.out.println("City: "+this.city);
        System.out.println("Capacity: "+this.capacity);
        System.out.println("Number of matches Scheduled:"+this.matchesScheduled+"\n\n");
    }
}
