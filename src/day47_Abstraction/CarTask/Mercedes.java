package day47_Abstraction.CarTask;

public class Mercedes extends Car{
    public Mercedes(String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(" Push button: press brake, push start button");
    }
}
/*
Mercedes:
            start(){   // how it's done
                push button: press brake, push start button
            }
 */