package day34_Arraylist;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        //containsAll - verify entire array

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        //verify if 10 is contained in the list
      boolean r1 = list.contains(10);
      
      boolean r2 = list.contains(10) && list.contains(30)&& list.contains(50) && list.contains(60);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);//false
        
        boolean r3 = list.containsAll(Arrays.asList(10,70,50,60));//arrays return to Collection type
        System.out.println("r3 = " + r3);

        
        ArrayList<String> group1 = new ArrayList<>();
        group1.add("Mohammad");
        group1.add("Sveta");
        group1.add("Ahmed");
        group1.add("Ercan");
        //Ahmed, Ercan, Biden

       boolean r5 = group1.containsAll(Arrays.asList( "Ahmed", "Ercan", "Biden"));
        System.out.println("r5 = " + r5);
         boolean r6 = group1.containsAll(Arrays.asList("Mohammad", "Ahmed","Sveta"));
        System.out.println("r6 = " + r6);
        System.out.println("====================================================");

        // addAll
       ArrayList<Character> chars = new ArrayList<>();//A,Z,C,B,H,I,K
        chars.addAll(Arrays.asList('A','Z','C','B','H','I','K'));
        System.out.println(chars);

        String[] names = {"Vasya","Muhtar", "John", "Daniel","Mohammed", "Emre","Lyuba"};
        ArrayList<String> students = new ArrayList<>(Arrays.asList(names));
       // students.addAll(Arrays.asList(names));

        System.out.println("students = " + students);

        ArrayList<Character> ch1 = new ArrayList<>(Arrays.asList('A','B','C','D','E'));
        ch1.addAll(Arrays.asList('J','K','L','M'));
        System.out.println(ch1);

        System.out.println("======================================");
ArrayList<String> group2 = new ArrayList<>();
group2.addAll(Arrays.asList(names));
        System.out.println("group2 = " + group2);
        group2.removeAll(Arrays.asList("Vasya", "John", "Mohammed"));
        System.out.println("group2 = " + group2);

        System.out.println("==========================================");
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmed", "Ahmed", "Erjon", "Ahmed", "Adil", "Afrooz"));
        
       /* for (int i = 0; i<= employees.size()-1;i++){
            if(employees.get(i).equals("Ahmed")){
                employees.remove(i);//without interface iterable, remove method cannot be used in loop
                
            }
        }*/
      employees.removeAll(Arrays.asList("Ahmed"));
        System.out.println("employees2 = " + employees);

        System.out.println("===================================");
        employees.retainAll(Arrays.asList("Ahmed"));
        System.out.println(employees);
    
    }
}
