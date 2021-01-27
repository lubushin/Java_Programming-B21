package day35_CustomClass;

import java.time.LocalDate;

public class Car {


    public String brand;//instance variable:allow to have different data,copies
    public String model;
    public String color;
    public LocalDate dOfB;
    public int year;
    public double price;

    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice)
    {
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;

    }
    public void getInfo(){
        System.out.println(brand+ " "+model+" "+color+" "+year+" $"+price);
    }

}
