package Practice_12_23_2020;

import java.time.LocalDate;
import java.util.*;

public class Map {
    public static void main(String[] args) {
        TreeMap<String, LocalDate> employees = new TreeMap<>();
        employees.put("John", LocalDate.of(2017,5,1));
        employees.put("Erjon", LocalDate.of(2021,4,1));
        employees.put("Afrooz", LocalDate.of(2020,3,1));
        employees.put("Haroon", LocalDate.of(2019,2,1));
        employees.put("Aysel", LocalDate.of(2018,1,1));

        for (String eachKey : employees.keySet()) {//key = names
         LocalDate eachValue = employees.get(eachKey);  //values=dates
            if(eachValue.isAfter(LocalDate.of(2019,1,1))){

                System.out.println(eachKey+ " : "+eachValue);
            }
        }
        System.out.println("=======================================");

        //<Map<String, Integer>> group1 = new LinkedHashMap<>();
         //<Map<String, Integer>> group2 = new LinkedHashMap<>();
          //<Map<String, Integer>> group3 = new LinkedHashMap<>();
           //<Map<String, Integer>> group4 = new LinkedHashMap<>();
            //<Map<String, Integer>> group5 = new LinkedHashMap<>();
       //List<Map<String, Integer>> list = new ArrayList<>();
       //list.addAll(Arrays.asList(group1,group2,));

    }
}
/*
 EmployeeName | Hired Date
      John           2017-5-1
      Erjon          2021-4-1
      Afrooz         2020-3-1
      Haroon         2019-2-1
      Aysel          2018-1-1
      .....
      displayed the Employee name and hire date of the employees who were hired before 2019

 */