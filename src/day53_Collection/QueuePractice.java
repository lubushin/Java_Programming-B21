package day53_Collection;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,12,9,8,11,5,4,6,3));
        System.out.println("arrayDeque= "+arrayDeque);
        arrayDeque.poll();//remove 10
        System.out.println("arrayDeque= "+arrayDeque);
        arrayDeque.poll();//remove 12
        System.out.println("arrayDeque= "+arrayDeque);
        System.out.println("==================================");
// int n1 = (Integer)((ArrayDeque)arrayDeque).getFirst();//returns only Object=>downCast
        Object n = ((ArrayDeque)arrayDeque).getFirst();//returns only Object
        System.out.println(((ArrayDeque)arrayDeque).getFirst());
        System.out.println(((ArrayDeque)arrayDeque).getLast());

        System.out.println("=======================================");

        Queue<Integer> linkedList = new ArrayDeque<>();
        linkedList.addAll(Arrays.asList(10,12,9,8,11,5,4,6,3));
        System.out.println("linkedList = "+linkedList);
        linkedList.poll();
        linkedList.poll();
        System.out.println("linkedList = "+linkedList);

     /*   System.out.println(((LinkedList<Integer>)linkedList).get(0));
        System.out.println(((LinkedList<Integer>)linkedList).get(linkedList.size()-1));
        System.out.println(((LinkedList<Integer>) linkedList).getFirst());
         System.out.println(((LinkedList<Integer>)linkedList).getLast());

        System.out.println(linkedList.add(null));
        System.out.println("linkedList = "+linkedList);*/
        System.out.println("========================");

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,1,4,5,6,7,8));
        System.out.println("priorityQueue="+priorityQueue);
        priorityQueue.poll();
        System.out.println("priorityQueue="+priorityQueue);
        priorityQueue.poll();
        System.out.println("priorityQueue="+priorityQueue);

      priorityQueue.add(null);//does not take NULL



    }
}
