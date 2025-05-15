package FinalPractice2;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        Country country = new Country(name);
        Freeway f1 = new Freeway(1,2,3,true);
        Street s1 = new Street("s1",4,434,true);
        Street s2 = new Street("s2",34,43,true);
        country.addRoad(f1);
        country.addRoad(s1);
        country.addRoad(s2);
        System.out.println("Number of Streets in "+name+" : "+country.countStreets());
        System.out.println(country.toString());
        System.out.println("Enter the name of street to search: ");
        String sName = scanner.nextLine();
        if(country.searchForStreet(sName) != null)
        {
            System.out.println("Available");
        }
        else {
            System.out.println("Not Found");
        }
    }
}
