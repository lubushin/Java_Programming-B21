package AMMentorPRCT;

import java.util.ArrayList;

public class ArraysArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        int size = list.size();
        System.out.println(size);
        int get2 = list.get(2);
        System.out.println(get2);
    }
}
