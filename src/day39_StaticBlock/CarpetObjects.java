package day39_StaticBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {

Carpet[] carpets = {new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};
carpets[0].customOrder(5,7,15,false);
carpets[1].customOrder(5,7,15,true);
carpets[2].customOrder(8,10,12,false);
carpets[3].customOrder(9,8,16,true);
carpets[4].customOrder(15,20,20,true);

ArrayList<Carpet> persianCarpet = new ArrayList<>(Arrays.asList(carpets));
persianCarpet.removeIf(p-> !p.isPersian);

 ArrayList<Carpet> regulapCarpet = new ArrayList<>(Arrays.asList(carpets));
 //regulapCarpet.removeAll(persianCarpet);
        regulapCarpet.removeIf(p-> p.isPersian);

        System.out.println("=============================================");
    double totalPriceOfPersion = 0;
    for(Carpet each : persianCarpet){
    System.out.println(each);
    totalPriceOfPersion += each.calcCost();

 }
        System.out.println("Total Price: " + totalPriceOfPersion);

        System.out.println("=====================================");

        double totalPriceOfRegularCarpet = 0;
        for(Carpet each : regulapCarpet){
            System.out.println(each);
            totalPriceOfRegularCarpet+=each.calcCost();
        }
System.out.println("totalPriceOfRegularCarpet = " + totalPriceOfRegularCarpet);
        System.out.println("===============================");
        System.out.println("Total Price = "+(totalPriceOfPersion+totalPriceOfRegularCarpet));
    }

}
/*
create a class called carpetObjects, and create an array of the carpet
 that contains 5 carpet objects ( make sure you set the instance
 variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        regularCarpets
write a program to store all the persian Carpets into the list of
persianCarpets, and store all regular carpets into the list of regularCarpets

use for each loop to print out all the persian carpets
 */