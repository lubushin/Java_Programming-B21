package HWCollectionPractice;

import java.util.*;

public class Iterable1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,3,5,6,7,7,3,9,4,8,9));
    for(int i =0; i<=list.size()-1;i++){
        if(list.get(i)<5);{
            list.remove(i);
        }
    }

        System.out.println(list);
        System.out.println("===================================");

    list.removeIf(p-> p<5);//shortcut for below
        System.out.println(list);

        System.out.println("=======================");
        Iterator<Integer> it =list.iterator();
        while(it.hasNext()){
            if(it.next()<5){
                it.remove();
            }
        }
        System.out.println(list);

        System.out.println("==============================");
        Set<Double> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0,1.5,2.5,3.5));
        set.removeIf(p-> p<4.5);
        System.out.println(set);
        System.out.println("===================================");

        for(Iterator<Double> i = set.iterator();i.hasNext();){
            if(i.next()<4.5){
                i.remove();
            }
        }
        System.out.println(set);
        System.out.println("===============================");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "Erjon","Ken", "Ahmed","Daniel", "Mustafa", "Ahmed"
        ));
        names.removeIf(p-> p.equalsIgnoreCase("ahmed"));
        System.out.println(names);

        System.out.println("=======================");
        for(Iterator<String> it1 = names.iterator();it1.hasNext();){
            if(it1.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("==========================");
        Iterator<String> it2 = names.iterator();
        while(it2.hasNext()){
           if(it2.next().equalsIgnoreCase("ahmed")){
               it2.remove();
           }
        }
        System.out.println(names);
    }
}
