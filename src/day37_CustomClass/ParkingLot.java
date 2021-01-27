package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ParkingLot {
    public static void main(String[] args) {
      Car[] cars = { new Car(), new Car(), new Car(), new Car(), new Car()};

        cars[0].setInfo("BMW","i8", "Black", LocalDate.of(2015,5,20),20000,20 );
        cars[1].setInfo("BMW","m4", "Black", LocalDate.of(2016,5,20),20000,20 );
        cars[2].setInfo("BMW","m4", "Black", LocalDate.of(2017,5,20),20000,20 );
        cars[3].setInfo("BMW","i8", "Black", LocalDate.of(2018,5,20),20000,20 );
        cars[4].setInfo("BMW","x5", "Black", LocalDate.of(2019,5,20),20000,20 );

       // ArrayList<Car> cars = new ArrayList<>();
//REcall all BMW that were build 2017
        ArrayList<Car> recall1 = new ArrayList<>();

        for(Car each : cars){
            if( each.brand.equals("BMW") && each.year<2017){
                recall1.add(each);
            }
        }
        System.out.println(recall1);
        System.out.println("=========================================================");
//recall All BMW i8 that were build 2016
       ArrayList<Car> recall2 = new ArrayList<>();
        for(Car each : cars){
            if(each.brand.equals("BMW") ){
                if(each.model.equals("i8") && each.year<2016){
                    recall2.add(each);
                }
            }
        }
        System.out.println(recall2);
        System.out.println("===============================================");
        ArrayList<Car> myCollection = new ArrayList<>();
        myCollection.addAll(Arrays.asList(cars));

        myCollection.removeIf(p-> !(p.brand.equals("BMW") && p.model.equals("m4")));
        System.out.println(myCollection);

    }
}
