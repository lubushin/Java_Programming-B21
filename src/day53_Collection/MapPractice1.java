package day53_Collection;

import aInterviewPractice.max;

import java.awt.geom.Arc2D;
import java.util.*;

public class MapPractice1 {
    public static void main(String[] args) {
       Map<String, Double> employeeInfo = new LinkedHashMap<>();
       //put(key,value)
       employeeInfo.put("Ken", 120000.0);
        employeeInfo.put("Ben", 135000.0);
        System.out.println(employeeInfo.size());
        System.out.println(employeeInfo);
        employeeInfo.put("Marvin", 150000.0);
        employeeInfo.put("Subhi", 146000.50);
        System.out.println(employeeInfo);
        System.out.println("============================");

        //remove(key)
        //System.out.println(employeeInfo.remove("Ken"));
        System.out.println(employeeInfo.remove("Subhi"));
       // System.out.println(employeeInfo.remove("Ken"));

        System.out.println("======================================");
        //get(key)
        System.out.println("Salary of Ken: $"+employeeInfo.get("Ken"));
        System.out.println("Salary of Ben: $"+employeeInfo.get("Ben"));
        System.out.println("======================================");
        System.out.println("Salary of Marvin: "+employeeInfo.get("Marvin"));

        //containsKey(key)-return boolean:true Marvin is in employeeUnfo
        System.out.println(employeeInfo.containsKey("Ben"));
        System.out.println(employeeInfo.containsKey("Rom"));
        System.out.println(employeeInfo.containsKey("Marvin"));

        System.out.println("=============================");
        //containsValue(value)-return boolean:true Marvin is making 150000 in employeeUnfo
        System.out.println(employeeInfo.containsValue(140000.0));
        System.out.println("====================================");

       //keySet() - print all key(employee) info as a set
        //System.out.println(employeeInfo.keySet());-only returns names
       // for( String eachkey :employeeInfo.keySet()){
           // System.out.println(eachkey +": "+ employeeInfo.get(eachkey));
        //}
        for (String eachkey : employeeInfo.keySet()) {
            System.out.println(eachkey+" : "+employeeInfo.get(eachkey));
        }


        System.out.println("=============================================");

        employeeInfo.put("Jack", 145000.0);
        employeeInfo.put("Daniel", 148000.0);
        employeeInfo.put("Lyuba", 155000.0);
        employeeInfo.put("Valor", 115000.0);

        double max = Double.MIN_VALUE,min = Double.MAX_VALUE;
           //\][poiuytre double max =Double.MIN_VALUE, min = Double.MAX_VALUE;
            String nameMax = "", nameMin = "";
        for (String eachName : employeeInfo.keySet()) {
            double eachSalary = employeeInfo.get(eachName);
            if(eachSalary>max){
                max = eachSalary;
                nameMax = eachName;
            }
            if(eachSalary<min){
                min = eachSalary;
                nameMin = eachName;

            }
        }
        System.out.println(nameMax + ": "+max);
        System.out.println(nameMin + ": "+min);
        System.out.println("================================================");

        System.out.println(employeeInfo);

       // employeeInfo.values().forEach(p->{System.out.println(p);});

        for (Double eachValue : employeeInfo.values()) {
            System.out.println(eachValue);
        }

        List<Double> salaries = (ArrayList)employeeInfo.values();
        System.out.println(salaries);

    }
}
