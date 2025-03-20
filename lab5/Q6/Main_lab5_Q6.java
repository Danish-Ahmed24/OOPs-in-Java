package Q6;

public class Main_lab5_Q6 {
    public static void main(String[] args) {
        Car_lab7_Q6 c1 = new Car_lab7_Q6(
                "BMW",
                "G7",
                101,
                "Petrol",
                266.6f,
                2000.5f);
        Car_lab7_Q6 c2 = new Car_lab7_Q6(
                "Lamborghini",
                "Avendador",
                202,
                "Diesel",
                264.6f,
                2200.5f);
        Car_lab7_Q6 c3 = new Car_lab7_Q6(
                "Rolls Royle",
                "R9",
                100,
                "Hybrid",
                1000.6f,
                500.5f);
        Management.showALlDetails();
    }
}
