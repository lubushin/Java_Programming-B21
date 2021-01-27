package day47_Abstraction.CarTask;

public class BMW extends Car{
    public BMW( String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }

    public void start(){
        System.out.println("Call mechanic: oil change, jump start, ask your frinds to push");
    }
}
/*
        BMW:
            start(){   // how it's done
                call mechanic: oil change, jump start, ask your frinds to push
            }
 */