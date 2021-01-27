package Practice_12_02_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();

        list.addAll(Arrays.asList('A','A','B','A','C','D','A','C'));
        //removeAll: remove all 'A' FROM ARRAY LIST
        list.removeAll(Arrays.asList('A'));// ermove the matching objects
        System.out.println(list);
        // retainAll: keep 'C', 'B'
        list.retainAll(Arrays.asList('C','B'));//removing not matching objects
        System.out.println(list);

        System.out.println("========================================");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(95,85,75,65,66,45,35,77,86));
        numbers.removeIf(p-> p<75);//predicate
        System.out.println(numbers);





    }
}
 /*
        removeALl
        retainALl
        removeIf
         */
