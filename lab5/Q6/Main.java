package Q6;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(
                "BMW",
                "G7",
                101,
                "Petrol",
                266.6f,
                2000.5f);
        Car c2 = new Car(
                "Lamborghini",
                "Avendador",
                202,
                "Diesel",
                264.6f,
                2200.5f);
        Car c3 = new Car(
                "Rolls Royle",
                "R9",
                100,
                "Hybrid",
                1000.6f,
                500.5f);
        Management.showALlDetails();
    }
}
