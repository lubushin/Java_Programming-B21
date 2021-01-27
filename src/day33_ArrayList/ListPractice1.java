package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice1 {
    public static void main(String[] args) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

    for(int i =0; i<=100; i++){
        if (i%2==0){
            even.add(i);
        }else {
            odd.add(i);
        }
    }
        System.out.println("Odd: "+odd);
        System.out.println("Even: "+even);

        System.out.println("Last odd number: "+ odd.get(odd.size()-1));
        System.out.println("Last even number: "+ even.get(even.size()-1));
        System.out.println("===========================================================");

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr3 = {6,7,9,7,90};
        int[] arr4 = {9,6,8,2,70};
        int[] arr5 = {34,56,78,59};
        int[][] arr2D = {arr1,arr2,arr3,arr4,arr5};

        ArrayList<Integer> list1 = new ArrayList<>();
        for(int[] each1D : arr2D){
            for(int eachElement : each1D){
                list1.add(eachElement);
            }
        }
        System.out.println(list1);

    }
}
