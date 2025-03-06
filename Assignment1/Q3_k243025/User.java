package A2.Q3_k243025;
import java.util.*;

public class User {
     static ArrayList<User> usersRegistered=new ArrayList<>();
     static ArrayList<Vehicle> rentedVechiles;
    private int age;
    private String licenseType; //learner , Intermediate , Full
    private int contactNumber;
    private int userID;
    private boolean registered;
    public User(int id,int age,int number,String licenseType)
    {
        this.rentedVechiles=new ArrayList<>();
        this.age=age;
        this.userID=id;
        this.contactNumber=number;
        this.licenseType=licenseType;
        this.registered=true;
        usersRegistered.add(this);
    }
    public void updateInfo(int age,String licenseType,int number)
    {
        this.age=age;
        this.licenseType=licenseType;
        this.contactNumber=number;
        this.usersRegistered.set(this.usersRegistered.indexOf(this),this);
        System.out.println("Info updated successfully! of User"+this.userID);
        System.out.println("Age: "+this.age);
        System.out.println("License Type: "+this.licenseType);
        System.out.println("Contact Number: "+this.contactNumber);
    }
    public void rentVehicle(Vehicle toBeRentedVehicle)
    {
        if(toBeRentedVehicle.getEligibility().contains(this.licenseType))
        {
            System.out.println("Vehicle Rented Successfully !");
            System.out.println("User"+this.userID+" rented "+toBeRentedVehicle.getModel());
            this.rentedVechiles.add(toBeRentedVehicle);
        }
        else {
            System.out.println("Not eligible! user"+this.userID);
        }
    }



    public int getUserID() {
        return userID;
    }
}
