package day43_Inheritance.carTask;

public class BMW extends Car{
    public BMW(String brand, String model, String color, String madeIn, int year, int miles, double price){
       // setInfo("BMW","I60", "red","Germany",2019,12,55000);
    }

    public static boolean isExpencive, isLuxury, breaksALot;
    static{
        isExpencive = true;
        isLuxury = true;
    }

}
/*
BMW
            isExpensive, isLuxury
            race()
        Mercedess
            autoPilot(), auotoParking()
        CarMax

 */
