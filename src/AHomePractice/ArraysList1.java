package AHomePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysList1 {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Egg");
        groceryList.add("Bread");
        groceryList.add("Milk");
        groceryList.add("Water");
        System.out.println(groceryList);

        groceryList.add(0,"Toilet paper");
        groceryList.add(1, "Sanitiser");
        groceryList.add(1,"Mask");
        System.out.println(groceryList);

        groceryList.addAll(Arrays.asList("pen", "pencil"));
       /* groceryList.set(3, "meat");
        System.out.println(groceryList);

        System.out.println(groceryList.indexOf("Milk"));
        System.out.println(groceryList.lastIndexOf("pen"));
        System.out.println(groceryList);
      groceryList.remove(2);
      groceryList.remove("Bread");
        System.out.println("remove Ind: "+groceryList);*/


        System.out.println(groceryList.contains("Java"));
        System.out.println(groceryList.contains("Bread"));
        System.out.println(groceryList.containsAll(Arrays.asList("Egg", "Crane")));

        groceryList.removeAll(Arrays.asList(groceryList,"pen", "Mask"));
        //groceryList.retainAll(Arrays.asList("Bread"));
        System.out.println(groceryList);

        //String item1 = groceryList.get(5);
       // System.out.println("item1: "+item1);

        int total = groceryList.size();
       // System.out.println("total: "+total);

        //System.out.println("last element: "+ groceryList.get(groceryList.size()-1));
        System.out.println("=======================================");
        Collections.sort(groceryList);
        Collections.swap(groceryList,3,4);
        System.out.println(groceryList);
        Collections.replaceAll(groceryList,"Bread","Candy");
        System.out.println(groceryList);
    }
}
