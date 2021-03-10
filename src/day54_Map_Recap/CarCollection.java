package day54_Map_Recap;

import java.util.*;

public class CarCollection {
    public static void main(String[] args) {
        String[] modelOfToyota = {"Camry","Rav4","Corolla","Land Cruiser", "Venza"};
        Integer[] yearOfToyota = {2001, 2011, 2015, 2021, 1965};

        String[] modelOfBMW = {"M1","M3","M5","X5", "X6"};
        Integer[] yearOfBMW = {1995, 2005, 2015, 2020, 2012};

        String[] modelOfMercedes = {"C-Class","A-Class","SLS","GLC"};
        Integer[] yearOfMercedes = {1990, 1995, 2015, 2021};


        List<Map<String, Integer>> carCollection = new ArrayList<>();
        carCollection.addAll(
                Arrays.asList(
                        new TreeMap<>(),  // for mercedes
                        new TreeMap<>(), // for toyota
                        new TreeMap<>() // for BMW
                )
        );

        for(int i = 0; i < modelOfToyota.length; i++){
            carCollection.get(1).put(modelOfToyota[i], yearOfToyota[i]);
        }

        for(int i = 0; i < modelOfBMW.length; i++){
            carCollection.get(2).put(modelOfBMW[i], yearOfBMW[i]);
        }

        for(int i = 0; i < modelOfMercedes.length; i++){
            carCollection.get(0).put(modelOfMercedes[i], yearOfMercedes[i]);
        }

        System.out.println(carCollection);

        for (int i = 0; i < carCollection.size(); i++) {
            Map<String, Integer> eachMap = carCollection.get(i);
            for (Map.Entry<String, Integer> eachPair : eachMap.entrySet()) {
                int year = eachPair.getValue();
                if(i == 0) { // Mercedes
                    if(year>= 1990 && year <= 1998 )
                        System.out.println(eachPair);
                }else if(i == 1){ // Toyota
                    if(year >= 1960 && year <= 1970)
                        System.out.println(eachPair);
                }else if( i==2){ // BMW
                    if(year >= 2011 && year <= 2015)
                        System.out.println(eachPair);
                }


            }
        }

        /*
        eligible to recall:
            BMW:
                2011 - 2015
            Mercedes:
                1990 - 1998
            Toyota:
                1960 - 1970
         */
    }
}
