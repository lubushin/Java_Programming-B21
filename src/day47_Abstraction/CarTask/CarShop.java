package day47_Abstraction.CarTask;

public class CarShop {
    public static void main(String[] args) {
Mercedes mercedes = new Mercedes("G class","White",2021,60000);
Toyota toyota = new Toyota("Camry","red",2017, 25000);
BMW bmw = new BMW("X5", "Black", 2016, 35000);
Tesla tesla = new Tesla("Model 3", "Neon Blue", 2020,70000);

System.out.println("Start Mercedes - ");
mercedes.start();

System.out.println("Start Toyota - ");
toyota.start();

System.out.println("Start Tesla - ");
tesla.start();

System.out.println("Start BMW - ");
bmw.start();

    }
}
