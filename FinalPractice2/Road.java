package FinalPractice2;
public class Road {
    private int speedLimit, length;
    private boolean carpool;

    public Road(int speedLimit, int length, boolean carpool) {
        this.speedLimit = speedLimit;
        this.length = length;
        this.carpool = carpool;
    }

    // Setters and getters are skipped here. Assume they exist if you need any of them.

    public String toString() {
        return "Road length " + length + ", speed limit is " + speedLimit +
                " and carpool lane is " + (carpool ? "available." : "not available.");
    }
}
