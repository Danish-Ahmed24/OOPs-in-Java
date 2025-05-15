package FinalPractice2;
public class Freeway extends Road {
    private int code;

    public Freeway(int code, int speedLimit, int length, boolean carpool) {
        super(speedLimit, length, carpool);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "This is freeway " + code + " " + super.toString();
    }
}
