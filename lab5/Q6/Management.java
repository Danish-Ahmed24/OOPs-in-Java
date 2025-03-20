package Q6;

import java.util.ArrayList;

public class Management {
    static ArrayList<Q6.Car_lab7_Q6> carLab7Q6s = new ArrayList<>();
    static void addCar(Q6.Car_lab7_Q6 carLab7Q6) {
        carLab7Q6s.add(carLab7Q6);
    }
    static void showALlDetails()
    {
        for(Q6.Car_lab7_Q6 carLab7Q6 : carLab7Q6s)
        {
            carLab7Q6.showDetails();
            System.out.println("-------------------------------");
        }
    }
}
