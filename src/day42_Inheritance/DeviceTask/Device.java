package day42_Inheritance.DeviceTask;

public class Device {
    public String brand, model;
    public double price;

    public static String madeIn;
    public static boolean hasBattery;
    public static boolean hasPowerButton;

    static{
       madeIn = "China";
       hasBattery = true;
       hasPowerButton = true;
    }

    public void setInfo(String deviceName,String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String toString() {
        return "Device{" +
                "brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", price = $" + price +
                '}';

    }
    public void turnOn(){
        System.out.println("Turning on "+brand+" "+model);
    }
    public void turnOff(){
        System.out.println("Turning off "+brand+" "+model);
    }
}
/*
 Device:
        instance variables: brand, model, price
        static: madeIn, hasBattery, hasPowerButton
        methods: setInfo, toString
    TV
    Phone
    Computer
 */