package lab6;

import java.util.ArrayList;

public class Q1_lab6 {
    public static void main(String[] args) {
        Car c1 = new Car("Honda","Civic",3232,652,"Petrol",544);
        Car c2 = new Car("Toyota","4x4",676,93,"Diesel",200);
        Car c3 = new Car("Suzuki","Cultus",403,1001,"Petrol",133);
        for(Car c : Car.getCars())
        {
            c.displayDetails();
        }
    }
}
class Car{
    private static ArrayList<Car> cars = new ArrayList<>();
    private String brandName;
    private String model;
    private int chassisNumber;
    private Engine engine;

    public Car(String bn,String mod,int chNum,int hp,String fuelType,int cap)
    {
        this.brandName=bn;
        this.model=mod;
        this.chassisNumber=chNum;
        this.engine=new Engine(hp,fuelType,cap);
        System.out.println("Car created success!");
        cars.add(this);
    }

    public static ArrayList<Car> getCars() {
        return cars;
    }

    public void displayDetails()
    {
        System.out.println("-----------------------------");
        System.out.println("Brand Name: "+this.brandName);
        System.out.println("Model: "+this.model);
        System.out.println("Chassis Number: "+this.chassisNumber);
        System.out.println("Engine: "+this.engine);
        this.engine.displayDetails();
    }
}

class Engine{
    private int horsePower;
    private String fuelType;
    private int capacity;
    public Engine(int hp,String ft,int cap)
    {
        this.capacity=cap;
        this.fuelType=ft;
        this.horsePower=hp;
        System.out.println("Engine Created success!");
    }
    public void displayDetails()
    {
        System.out.println("-----Engine-------");
        System.out.println("Horse Power: "+this.horsePower);
        System.out.println("Fuel Type: "+this.fuelType);
        System.out.println("Capacity: "+this.capacity);
    }
}
