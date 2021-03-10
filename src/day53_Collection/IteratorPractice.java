package day53_Collection;

import java.util.*;

public class IteratorPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,13,14,15));
        for(int i =0; i< list.size();i++){//remove less than 5
            if(list.get(i)<5){
                list.remove(i);
            }
        }


        /*for(int each : list){
            if(each<5){
                list.remove(each);
            }
        }*/

        System.out.println(list);
        System.out.println("------------");


       Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if(it.next()<5){
                it.remove();
            }
        }

        list.removeIf(p-> p<5);//SHortCut for above

        System.out.println(list);
        System.out.println("===========================================");

        Set<Double> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,1.5,2.5,3.5));
        //set.removeIf(p-> p<4.5);//lambda; shortCut for below for loop

        for(Iterator<Double> i = set.iterator(); i.hasNext();){
            if(i.next()<4.5){
                i.remove();
            }
        }
        System.out.println(set);

        System.out.println("==================================");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "ahmed", "aHmED","John", "Daniel","Mustafa"));
for(Iterator<String> t = names.iterator(); t.hasNext();){
    if(t.next().equalsIgnoreCase("ahmed")){
        t.remove();
    }
}

       /* Iterator<String> n = names.iterator();
        while(n.hasNext()){
            String eachName = n.next();
            if(eachName.equalsIgnoreCase("ahmed")){
                n.remove();
            }
        }*/

         //names.removeIf(p-> p.equalsIgnoreCase("ahmed"));

        System.out.println(names);
}
    }

