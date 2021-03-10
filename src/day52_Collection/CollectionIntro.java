package day52_Collection;

import java.util.*;

public class CollectionIntro {
    public static void main(String[] args) {
        //ArrayList<Integer> numbers = new ArrayList<>();
        Collection<Integer> numbers = new ArrayList<>();
        System.out.println(numbers.size());//0
        Collection<Integer> numbers1 = new ArrayList<>();
        numbers1.addAll(Arrays.asList(12,13,14,15));
        System.out.println(numbers1);
        System.out.println(numbers.size());
        numbers1.removeAll(Arrays.asList(12,14));
        System.out.println(numbers1);

        System.out.println("=======================================");
        numbers.add(100);//1
        System.out.println(numbers.size());

        numbers.addAll(Arrays.asList(200,300,400,500));//5
        System.out.println(numbers.size());

        System.out.println("=========================");

        numbers.removeAll(Arrays.asList(100,400));
        System.out.println(numbers.size());
        System.out.println(numbers);

   System.out.println(((ArrayList) numbers).get(0));//MUST HAVe IS RElationship to Cast

        Collection<String> names = new LinkedHashSet<>();
        Collection<Integer> scores = new LinkedList<>();

    }
}
