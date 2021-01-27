package day33_ArrayList;

import java.util.ArrayList;

public class ListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(200);
        list1.add(300);
// SET method - index
        list1.set(1,400);//replace the elements
        System.out.println(list1);

        ArrayList<String> names = new ArrayList<>();
        names.add("Lena");
        names.add("Maya");
        names.add("Ken");
        names.add("Roma");
        names.add("Maya");
        names.add("Kema");
        names.add("Lena");

        names.set(0,"Naya");
        names.set(4, "Valya");
        System.out.println(names);

        int[] arr = {10,20,30,40};
        arr[1] = 200;
        System.out.println("============================================");
                //REMOVE Index
ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        System.out.println("==============================================================");
        // Remove (object)
        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('D');
        list2.add('E');

        Character ch = 'C';
        list2.remove(ch);
        System.out.println(list2);

    }
}
