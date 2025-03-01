package Q6;

import java.util.ArrayList;

public class Management {
    static ArrayList<Car> cars = new ArrayList<>();
    static void addCar(Car car) {
        cars.add(car);
    }
    static void showALlDetails()
    {
        for(Car car : cars)
        {
            car.showDetails();
            System.out.println("-------------------------------");
        }
    }
}
