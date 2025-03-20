package Q6;

public class Vehcile_Q6 {
    private String brand , model;
    public Vehcile_Q6(String brand, String model)
    {
        this.brand=brand;
        this.model=model;
    }
    protected void showDetails()
    {
        System.out.println("General details showing");
    }

}
class Car extends Vehcile_Q6 {
    private String brand , model;
    private int numberOfSeats;
    public Car(String  brand , String model,int seats)
    {
        super(brand,model);
        this.brand =brand;
        this.model=model;
        this.numberOfSeats=seats;
    }

    protected void showDetails()
    {
        System.out.println("Brand: "+this.brand);
        System.out.println("Model:" +this.brand);
        System.out.println("Engine seats "+this.numberOfSeats);
    }

}
class Bike extends Vehcile_Q6 {
    private int engineCapacity;
    private String brand , model;
    public Bike(String brand,String model,int engineCapacity)
    {
        super(brand,model);
        this.brand=brand;
        this.model=model;
        this.engineCapacity=engineCapacity;
    }
    protected void showDetails()
    {
        System.out.println("Brand: "+this.brand);
        System.out.println("Model:" +this.brand);
        System.out.println("Engine capacity "+this.engineCapacity);
    }

    public static void main(String[] args) {
        Vehcile_Q6 bike = new Bike("Honda","CD50",45);
        bike.showDetails();
        Vehcile_Q6 car = new Car("TOyota","Farari",3);
        car.showDetails();
    }
}
