package day47_Abstraction.CarTask;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }
    public void start(){
        System.out.println(" Voice control: say start");
    }
}
/*
      Tesla:
            start(){    // how it's done
                voice control: say start
            }
 */