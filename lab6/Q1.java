package lab6;

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {

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
    public void displayDetails()
    {
        System.out.println();
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
}
