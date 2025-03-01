package Q6;

public class Engine {
    private String fuelType;
    private float horsePower;
    private float capacity;
    public Engine(String fuelType, float horsePower, float capacity) {
        this.fuelType = fuelType;
        this.horsePower = horsePower;
        this.capacity = capacity;
    }
    void showDetails() {
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Horse Power: " + horsePower);
        System.out.println("Capacity: " + capacity);
    }
}
