package HWCollectionPractice;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("Afrooz", 155000.0);
        employeeInfo.put("Muhammad", 145000.0);

        System.out.println(employeeInfo.size());
        System.out.println(employeeInfo);

        System.out.println("Salary of Muhammad: "+employeeInfo.get("Muhammad"));

        System.out.println(employeeInfo.containsKey("Muhammad"));
        System.out.println(employeeInfo.containsKey("Ayse"));

        System.out.println(employeeInfo.containsValue(145000.0));

        System.out.println("===========================");
        for (String eachKey : employeeInfo.keySet()) {
            System.out.println(eachKey + " : "+employeeInfo.get(eachKey));
        }
        System.out.println("=====================");

        employeeInfo.put("Mustafa", 123000.0);
        employeeInfo.put("Emre", 103000.0);
        employeeInfo.put("Apo", 100000.0);

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        String NameMax = "";
        String nameMin = "";
        for (String eachName : employeeInfo.keySet()) {
            double eachSalary = employeeInfo.get(eachName);

            if(eachSalary>max){
                max=eachSalary;
                NameMax = eachName;
            }
            if(eachSalary<min){
                min = eachSalary;
                nameMin = eachName;
            }
        }

        System.out.println(NameMax + " : "+max);
        System.out.println(nameMin + " : "+min);

        System.out.println("=============================");
        System.out.println(employeeInfo);
        employeeInfo.values().forEach(p->{
            System.out.println(p);
        });

        for (Double eachValue : employeeInfo.values()) {
            System.out.println(eachValue);
        }
        System.out.println("=========================");
        List<Double> salary = new ArrayList<>(employeeInfo.values());
        System.out.print(salary);
    }
}
