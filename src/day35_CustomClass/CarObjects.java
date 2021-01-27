package day35_CustomClass;

public class CarObjects {

    public static void main(String[] args) {
        Car car1 = new Car(); //has own brand
        Car car2 = new Car(); //has own brand
        Car car3 = new Car(); //has own brand

        car1.brand = "Toyota";//first copy, text,data
        car2.brand = "Honda";//second copy, text,data
        car3.brand = "Lexus";//third copy, text,data

        System.out.println(car1.brand);
        System.out.println(car2.brand);
        System.out.println(car3.brand);
        System.out.println("===========================================");

        car1.model = "Corolla";
        car2.model = "Fit";
        car3.model = "RX";
        System.out.println(car1.model);
        System.out.println(car2.model);
        System.out.println(car3.model);
        System.out.println("=====================================================");
        Car car4 = new Car();

        System.out.println(car4.brand);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.year);
        car4.setInfo("Mercedes", "GL250", "Red", 2018,48000);

       car4.getInfo();
    }
}
