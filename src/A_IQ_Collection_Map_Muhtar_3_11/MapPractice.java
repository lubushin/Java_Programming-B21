package A_IQ_Collection_Map_Muhtar_3_11;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));

        // display the names employees who were hired before year 2015
        for(String name: map.keySet()){
            LocalDate hireDateValue = map.get(name);
            if(hireDateValue.isBefore(LocalDate.of(2015,1,1)))
                System.out.println(name);
        }
        System.out.println("============================");
        // display the hired date of the employee who were hire 5/15/2020
        for(String name: map.keySet()){
            LocalDate hireDateValue = map.get(name);
            if(hireDateValue.isEqual(LocalDate.of(2020,1,1)))
                System.out.println(name);
        }
        System.out.println("=========================================");

        // how many employees were hired after 2014
        int count = 0;
        for(LocalDate hireDateValue : map.values()){
            if(hireDateValue.isAfter(LocalDate.of(2013,12,31))){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("============================================");
        // display the name and hire date of the employee

        for(Map.Entry<String, LocalDate> each : map.entrySet()){
            System.out.println(each);
        }

    }
}
