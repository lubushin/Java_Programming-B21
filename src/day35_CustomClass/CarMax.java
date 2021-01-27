package day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarMax {
    public static void main(String[] args) {

        Car car1 =  new Car();
        Car car2 =  new Car();
        Car car3 =  new Car();
        Car car4 =  new Car();
        Car car5 =  new Car();

        car1.setInfo("Honda", "Fit", "Vibrant Blue", 2018,19000);
        car1.getInfo();

        car2.setInfo("Toyota", "Camry", "Green",2006, 24000);
        car2.getInfo();

        car3.setInfo("Audi", "Q5", "White", 2015,48000);
        car3.getInfo();

        car4.setInfo("Honda", "Accord","White",2007,38000);
        car4.getInfo();

        car5.setInfo("Subary","Forester","Red", 2017,40000);
        car5.getInfo();

        System.out.println("==============================================");
        Car[] cars = {car1, car2, car3, car4, car5};
    for( Car eachCar : cars){
        eachCar.getInfo();
        }

        System.out.println("==============================================");

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(cars));

        carList.removeIf(p-> p.price < 25000);

        for(int i =0; i<=carList.size()-1;i++){
            carList.get(i).getInfo();

        }

    }



}
