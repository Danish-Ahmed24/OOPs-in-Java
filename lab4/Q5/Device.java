package Q5;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Device {
    static ArrayList<Device> devices = new ArrayList<Device>();
    private int id;
    private String type;
    private float powerConsumption;
    private boolean on;
    Device (String ignore){}
    Device(int id, String type, float powerConsumption, boolean on) {
        this.id = id;
        this.type = type;
        this.powerConsumption = powerConsumption;
        this.on = on;
        devices.add(this);
    }
    Device(){
        this.id = 0;
        this.type = "Unknown";
        this.powerConsumption = 0;
        this.on = false;
        devices.add(this);
        this.displayDefualt();
    }
    float totalPowerConsumption(){
        float totalPowerConsumption = 0;
        for (int i = 0; i < devices.size(); i++) {
            totalPowerConsumption += devices.get(i).powerConsumption;
        }
        return totalPowerConsumption;
    }
    void removeDevice()
    {
        devices.remove(this);
        System.out.println("Device record deleted: "+this.id);
    }
    void displayAll()
    {
        System.out.println("New Devices Added: ");
        for (int i = 0; i < devices.size(); i++) {
            System.out.print("Device ID: "+devices.get(i).id +"| Type : "+devices.get(i).type+"| Power Consumption : "+devices.get(i).powerConsumption+"W | Status : ");
        if(devices.get(i).on)
        {
            System.out.println("On");
        }
        else {
            System.out.println("Off");
        }
        }
        System.out.println("\nTotal Active Power Consumption : "+totalPowerConsumption() +"W");
    }
    void displayDefualt()
    {
        System.out.println("Default Device Added: ");
        System.out.println("Device ID: "+this.id);
        System.out.println("Device Type: "+this.type);
        System.out.println("Device Power Consumption: "+this.powerConsumption+"W");
        System.out.print("Device Status: ");
        if(this.on)
        {
            System.out.println("On");
        }
        else {
            System.out.println("Off");
        }
    }
    }

