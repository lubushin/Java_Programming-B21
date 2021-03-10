package HWCollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Listpractice {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,6,7,8));
        System.out.println(list1.get(4));//faster


        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(2,3,4,5,6,7,8,9,1,1,3,4));
        System.out.println(list2.get(4));

    }
}
