package FinalPractice2;
public class Street extends Road {
    private String name;

    public Street(String name, int speedLimit, int length, boolean carpool) {
        super(speedLimit, length, carpool);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "This is " + name + " st. " + super.toString();
    }
}
