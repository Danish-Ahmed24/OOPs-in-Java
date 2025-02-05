package Q2;

import java.util.Scanner;

public class Session {
    Scanner in = new Scanner(System.in);
    String sessionTitle,speakerName;
    float duration;
    int roomNumber;
    void scheduleSession(){
        System.out.println("Enter SessionTitle: ");
        this.sessionTitle=in.nextLine();
        System.out.println("Enter speakerName: ");
        this.speakerName=in.nextLine();
        System.out.println("Enter the duration: ");
        this.duration=in.nextFloat();
        System.out.println("Enter the room number: ");
        this.roomNumber=in.nextInt();
    }//to assign a speaker and room
    void displaySessionDetails(){
        System.out.println("\n\nSessionTitle: "+this.sessionTitle);
        System.out.println("Speaker Name: "+this.speakerName);
        System.out.println("Duration: "+this.duration);
        System.out.println("Room number: "+this.roomNumber);
        System.out.println("\n\n");
    }

}

//Design a Session class with attributes sessionTitle, speakerName, duration, and roomNumber.
//Implement methods scheduleSession() to assign a speaker and room and displaySessionDetails() to show session
//information. Create objects for different sessions (e.g., "AI in Modern Applications", "Cybersecurity Trends")
//and schedule them with speakers.