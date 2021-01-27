package day34_Arraylist;

import java.util.ArrayList;

public class WarmUp {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(20);
        numbers.add(30);
        numbers.add(1,40);
        System.out.println(numbers);

        numbers.set(numbers.size()-1,0);
        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers.isEmpty());

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);

        for(int i= 0; i<= numbers.size()-1;i++){
           int each = numbers.get(i);
           if(each%2!=0){
               numbers.set(i,each*2);
           }
        }
        System.out.println(numbers);

        System.out.println("==================================================");

        int[] score ={58,65,75,77,80,85,68,88,82,72,95,99,98,100,90};

        ArrayList<Integer> Alist = new ArrayList<>();
        ArrayList<Integer> Blist = new ArrayList<>();
        ArrayList<Integer> Clist = new ArrayList<>();
        ArrayList<Integer> Dlist = new ArrayList<>();
        ArrayList<Integer> Flist = new ArrayList<>();

        for(int each: score) {
            if (each > 0 && each <= 100) {
                if (each >= 90) {
                    Alist.add(each);
                } else if (each >= 80) {
                    Blist.add(each);
                } else if (each >= 70) {
                    Clist.add(each);
                } else if (each >= 60) {
                    Dlist.add(each);
                } else {
                    Flist.add(each);
                }
            }
        }
        System.out.println("Total numbers of A: " + Alist.size());
        System.out.println("Total numbers of B: " + Blist.size());
        System.out.println("Total numbers of C: " + Clist.size());
        System.out.println("Total numbers of D: " + Dlist.size());
        System.out.println("Total numbers of F: " + Flist.size());

        System.out.println("A: "+Alist);
        System.out.println("B: "+Blist);
        System.out.println("C: "+Clist);
        System.out.println("D: "+Dlist);
        System.out.println("F: "+Flist);
        }
    }

    /*
    1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
    2. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
     3. Grades
     */
