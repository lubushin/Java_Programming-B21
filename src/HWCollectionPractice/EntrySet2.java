package HWCollectionPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySet2 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("A",120000);
        employeeInfo.put("B",130000);
        employeeInfo.put("C",135000);
        employeeInfo.put("D",145000);
        employeeInfo.put("E",150000);
        employeeInfo.put("F",110000);
        System.out.println(employeeInfo);
        System.out.println("====================");

Integer max = Integer.MIN_VALUE;
Integer min = Integer.MAX_VALUE;
String nameMax ="";
String namMin = "";

        for(Map.Entry<String, Integer> each : employeeInfo.entrySet()){
            String name = each.getKey();
            Integer salary = each.getValue();
            if(salary>max){
                max=salary;
                nameMax = name;
            }
            if(salary<min){
                min=salary;
                namMin = name;
            }
        }

        System.out.println(nameMax + ": "+max);
        System.out.println(namMin + ": "+min);
    }
}
