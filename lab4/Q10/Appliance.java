package Q10;

import java.util.Scanner;

public class Appliance {
    Appliance() {
        System.out.println("Appliance's Default Constructor");
    }

    Appliance(String type) {
        this();
        System.out.println("Appliance Type: " + type);
    }
    Appliance(String type,double powerRating){
        this(type);
        System.out.println("Appliance PowerRating: "+powerRating+"W");
    }
}

class Electronic extends Appliance {
    Electronic() {
        this("General Electronic");
        System.out.println("Electronic's Default Constructor");
    }

    Electronic(String category) {
        super("Electronic",1500);
        System.out.println("Electronic Category: " + category);
    }
}

class Laptop extends Electronic {
    Laptop() {
        this("No Brand", 8);
        System.out.println("Laptop's Default Constructor");
    }

    Laptop(String brand) {
        super("Laptop");
        System.out.println("Laptop Brand: " + brand);
    }

    Laptop(String brand, int ram) {
        this(brand);
        System.out.println("Laptop RAM: " + ram + "GB");
    }
}
