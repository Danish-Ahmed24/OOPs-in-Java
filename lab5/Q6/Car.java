package Q6;

public class Car {
    private String brandName;
    private String model;
    private int chassisNumber;
    private Engine engine;
    public Car(String brandName, String model, int chassisNumber,String fuelType,float hp,float capacity) {
        this.brandName = brandName;
        this.model = model;
        this.chassisNumber = chassisNumber;
        this.engine = new Engine(fuelType,hp,capacity);
        Management.addCar(this);
    }
    public void showDetails() {
        System.out.println("Brand: " + brandName);
        System.out.println("Model: " + model);
        System.out.println("Chassis: " + chassisNumber);
        engine.showDetails();
    }
}
