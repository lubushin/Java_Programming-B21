package day38_StaticKeyWord;

public class Iphone {
    public String model, color, storage;
    public double price;

    public static String brand = "Apple", OS = "iOS", madein = "China";

    public void call(long phoneNumber){
        System.out.println("Iphone "+model + " is calling "+phoneNumber);
    }

    public static void getInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Operating System: "+OS);
        System.out.println("Made in: "+madein);
    }


    public String toString() {
        return "Brand: "+brand+", Model: "+model+", Color: "+color+", Price: "+price+", Operating System: "+OS;

    }
}
