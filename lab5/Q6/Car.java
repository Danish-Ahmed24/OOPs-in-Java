package Q6;

class Car_lab7_Q6 {
    private String brandName;
    private String model;
    private int chassisNumber;
    private Engine engine;
    public Car_lab7_Q6(String brandName, String model, int chassisNumber,String fuelType,float hp,float capacity) {
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
