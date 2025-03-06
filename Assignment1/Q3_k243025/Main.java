package A2.Q3_k243025;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> v8License = new ArrayList<>(Arrays.asList("Full license"));
        ArrayList<String> lamboLicense = new ArrayList<>(Arrays.asList("Learner","Full license"));
        User rafay = new User(1,12,93243372,"Learner");
        User danish = new User(2,18,89957992,"Full license");
        Vehicle v8 = new Vehicle("v8",1000,v8License);
        Vehicle lambo = new Vehicle("spider",10000,lamboLicense);
        rafay.rentVehicle(v8);
        danish.rentVehicle(v8);
        danish.updateInfo(19,"Learner",324423423);
        danish.rentVehicle(lambo);
        System.out.println("----All user and their rented cars----");
        for(User i: User.usersRegistered)
        {
            System.out.println("User "+i.getUserID()+" \nRented Cars:");
            for(Vehicle a : User.rentedVechiles)
            {
                System.out.println("Car model: "+a.getModel());
            }
            System.out.println("=====================");
        }
    }
}
