package day54_Map_Recap;

import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySetPractice2 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("A",120000);
        employeeInfo.put("B",130000);
        employeeInfo.put("C",140000);
        employeeInfo.put("D",150000);
        employeeInfo.put("E",155000);
        employeeInfo.put("F",135000);
        System.out.println(employeeInfo);

        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        String nameMax = "";
        String nameMin = "";
        for (Map.Entry<String, Integer>each : employeeInfo.entrySet()) {
           String name = each.getKey();
           Integer salary =each.getValue();
           if(salary > max){
               max=salary;
               nameMax = name;
           }
           if(salary<min){
               min=salary;
               nameMin = name;
           }

        }

        System.out.println("max: "+max);
        System.out.println("nameMax: "+nameMax);

        System.out.println("min: "+min);
        System.out.println("nameMin: "+nameMin);


    }

}
