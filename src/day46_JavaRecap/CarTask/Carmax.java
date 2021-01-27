package day46_JavaRecap.CarTask;

public class Carmax {

    public static void main(String[] args) {

    Mercedes mercedes = new Mercedes("G Class","Red",2021,3000000);
    Lexus lexus = new Lexus("RX 35", "White", 2018, 20000);
    BMW bmw = new BMW("X6", "Black",2019,45000);
    Tesla tesla = new Tesla("Model 3", "Blue", 2020,50000);

mercedes.start();
lexus.start();
bmw.start();
tesla.start();
System.out.println("=========================================");

mercedes.drive();
lexus.drive();
bmw.drive();
tesla.drive();

System.out.println("======================================");
bmw.autoPark();
tesla.autoPilot();

    }
}
