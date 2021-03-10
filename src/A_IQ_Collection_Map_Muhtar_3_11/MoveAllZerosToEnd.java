package A_IQ_Collection_Map_Muhtar_3_11;

import java.util.*;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 3, 0, 2, 0, 1, 0));//[3,2,1,0,0,0]

//How many 0 we have in list
        int totalNumOfZeros = Collections.frequency(list, 0);//7
        list.removeAll(Arrays.asList(0));//[3,2,1]-all 0 removed
        for (int i = 0; i < totalNumOfZeros; i++) {
            list.add(0);
        }
        System.out.println(list);

        System.out.println("==============================");
       /* // second way to do
       int originalSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize=list.size();
        int totalNumOfZeros1 = originalSize - newSize;
        for (int i  = 0;  i< totalNumOfZeros; i++) {
            list.add(0);
        }
        System.out.println(list); */

        System.out.println("================================");
        // using ARRAY ; size is fixed
        int[] array = {3, 0, 1, 0, 2, 0};//{3,2,1,0,0,0}
        int[] newArray = new int[array.length];
        System.out.println(Arrays.toString(newArray));

        int count = 0;
        for (int each : array) {
            if (each != 0) {
                newArray[count++] = each;
            }
        }
        System.out.println(Arrays.toString(newArray));

        System.out.println("====================================");

        // -- using ITERATOR --

        List<Integer> list2 = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 3, 0, 2, 0, 1, 0));//[3,2,1,0,0,0]

        //How many 0 we have in list
        int totalNumOfZeros2 = Collections.frequency(list, 0);//7
        //list2.removeAll(Arrays.asList(0));//[3,2,1]-all 0 removed - CAN NOT USE
        Iterator<Integer> iterate = list2.listIterator();
        while (iterate.hasNext()) {
            if (iterate.next() == 0) {
                iterate.remove();
            }
        }
        for (int i = 0; i < totalNumOfZeros2; i++) {
            list2.add(0);
        }
        System.out.println(list2);
    }
}
        /*// Muhtars class:
        // display the names of employees who were hired before year 2015
       for( String name : map.keySet() ){
           LocalDate hireDate = map.get(name);
           if(hireDate.isBefore(LocalDate.of(2015,1,1))){
               System.out.println(name);
           }
       }


        System.out.println("=====================================");
        // display the name of the employee who were hire 5/15/2020
        for( String name : map.keySet() ){
            LocalDate hireDate = map.get(name);
            if(hireDate.isEqual(LocalDate.of(2020,5,15))){
                System.out.println(name);
            }
        }

        System.out.println("==============================================");
        // how many people were hired after 2014
        int count = 0;
        for (LocalDate hireDate : map.values()){
            if(hireDate.isAfter( LocalDate.of(2013, 12, 31))){
                count++;
            }
        }

        System.out.println(count);


        System.out.println("=================================================");
        // display the name and hire date of the employee

        for(Map.Entry<String, LocalDate>  each: map.entrySet()){
            //  System.out.println(each);
            String name = each.getKey();
            LocalDate hireDate = each.getValue();

            System.out.println(name+ " was hired on "+hireDate);
        }



    }
    */

