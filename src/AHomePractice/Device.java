package AHomePractice;

public class Device {

    public double price;
    public static String madeIn = "China";
    public String brand, model;
    public static boolean hasBattery = true, hasPowerButton = true;

/*    static{
        madeIn = "China";
        hasBattery = true;
        hasPowerButton = true;
    }
    */

public Device(String brand, String model, double price){
     this.brand = brand;
     this.model = model;
     this.price = price;
    }

    public String toString() {
        return "Device{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

}
