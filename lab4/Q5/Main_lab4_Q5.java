package Q5;

public class Main_lab4_Q5 {
    public static void main(String[] args) {
        Device device = new Device();
        Device device2 = new Device(1001,"Smart Light",10f,true);
        Device device3 = new Device(1002,"Air Conditioner",1500f,true);
        Device device4 = new Device(1003,"Smart Fan",50f,false);
        new Device("IGNORE").displayAll();
        device.removeDevice();
        device2.removeDevice();
        device3.removeDevice();
        device4.removeDevice();
    }
}
