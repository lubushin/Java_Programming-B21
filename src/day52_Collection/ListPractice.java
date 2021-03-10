package day52_Collection;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        //List(I): has index numbers,accepts duplicates

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5));

        System.out.println("+++++++++++++++++++++++++");

        List<Integer> list8 = new ArrayList<>();
        list8.addAll(Arrays.asList(12,13,14,15,16));
        list8.removeIf(p-> p<13);
        System.out.println(list8);
        list8.get(3);
        System.out.println(list8);
        List<Integer> list7 = new Stack<>();
        list7.addAll(Arrays.asList(90,80,70,60));
        ((Stack<Integer>)list7).pop();
        System.out.println(list7);


        System.out.println("+++++++++++++++++++++");


        list1.removeIf(p-> p<5);
        System.out.println(list1.get(4));//Faster

        System.out.println(list1);

        List<Integer> list2 = new LinkedList<>();
        
        //adding or removing elements performed faster that Array List
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5));//Faster
        list2.removeIf(p-> p<5);//Faster

        System.out.println(list1.get(4));

        System.out.println(list2);

        List<Integer> list3 = new Vector<>();

        List<Integer> list4 = new Stack<>();

        list4.addAll(Arrays.asList(15,25,35,45));

        ((Stack<Integer>)list4).pop();
        System.out.println(list4);

        ((Stack<Integer>)list4).pop();
        System.out.println(list4);

        System.out.println("================================");

        Stack<String> names = new Stack<>();
        names.addAll(Arrays.asList("Aysel", "Amir", "Mohammed", "Bursa", "Necdat", "Break"));
        System.out.println(names);
        names.pop();//removes only last element from the end;
        System.out.println(names);
        names.pop();
        System.out.println(names);
        names.pop();
        System.out.println(names);

    }
}
