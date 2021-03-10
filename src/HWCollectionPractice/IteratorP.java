package HWCollectionPractice;

import java.util.*;

public class IteratorP {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 2, 3, 4, 5, 6, 7, 8, 5, 6, 4, 7, 8));
        /*Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if(it.next()<5){
                it.remove();
                }
                }*/


        //list.removeIf(p-> p<5);
        System.out.println(list);
        System.out.println("==========");
        Set<Double> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(2.0, 1.0, 3.0, 4.0, 5.5, 6.0, 7.5, 3.5, 4.5, 5.0, 6.5, 8.0, 9.5));
        for (Iterator<Double> it = set.iterator(); it.hasNext(); ) {
            if (it.next() < 7.5) {
                it.remove();
            }


            // set.removeIf(p-> p<7.5);

            System.out.println(set);
            System.out.println("++++++++++++++++++++++++++++");
            List<String> names = new ArrayList<>();
            names.addAll(Arrays.asList("Ahmed", "Ron", " Ken", "ron", "Ben", "roN", "Art"));
            for (Iterator<String> it1 = names.iterator(); it1.hasNext(); ) {
                if (it1.next().equalsIgnoreCase("ron")) {
                    it1.remove();
                }
            }

            //names.removeIf(p-> p.equalsIgnoreCase("ron"));
            System.out.println(names);
        }
    }
}


