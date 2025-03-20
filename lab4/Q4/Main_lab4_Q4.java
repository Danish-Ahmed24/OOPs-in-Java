package Q4;

public class Main_lab4_Q4 {
    public static void main(String[] args) {
        Employee e1 =new Employee();
        e1.displayInfo();
        Employee e2 = new Employee(101,"Danish Ahmed",5000.0f,10.4f);
        e2.displayInfo();

        e1.deleteDemo();
        e2.deleteDemo();
    }
}

