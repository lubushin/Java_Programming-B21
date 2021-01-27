package day47_Abstraction.CarTask;

public abstract class Car{//can not create object
    public String brand, model,color;
    public int year;
    public double price;

    public Car(String brand, String model, String color, int year, double price){}

    public abstract void start();

    @Override
    public String toString() {
        return "Car" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '/';
    }
}
/*
 Car
    start();
 */