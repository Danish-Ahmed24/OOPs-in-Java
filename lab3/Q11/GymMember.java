package Q11;

import java.util.ArrayList;
import java.util.Scanner;

public class GymMember {
    Scanner in = new Scanner(System.in);
    static ArrayList<GymMember> membersList = new ArrayList<>();
    String name;

    void registerMember() {
        System.out.println("Enter Member Name: ");
        String memberName = in.nextLine();
        GymMember newMember = new GymMember();
        newMember.name = memberName;
        membersList.add(newMember);
        System.out.println(memberName + " has been registered!");
    }

    void displayMembers() {
        if (membersList.isEmpty()) {
            System.out.println("No active members.");
            return;
        }
        System.out.println("Active Gym Members:");
        for (int i = 0; i < membersList.size(); i++) {
            System.out.println((i + 1) + " Name: " + membersList.get(i).name);
        }
    }

    void removeMember() {
        System.out.println("Enter the name to remove: ");
        String pName = in.nextLine();
        boolean found = false;

        for (int i = 0; i < membersList.size(); i++) {
            if (membersList.get(i).name.equals(pName)) {
                membersList.remove(i);
                System.out.println(pName + " has been removed!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No match!");
        }
    }

    void updateMemberName() {
        System.out.println("Enter your previous name: ");
        String pName = in.nextLine();
        boolean found = false;
        int index = -1;

        for (int i = 0; i < membersList.size(); i++) {
            if (membersList.get(i).name.equals(pName)) {
                index = i;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Enter new Name: ");
            membersList.get(index).name = in.nextLine();
            System.out.println("Name updated successfully!");
        } else {
            System.out.println("No match!");
        }
    }



    }

