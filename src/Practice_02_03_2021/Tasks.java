package Practice_02_03_2021;

import java.util.*;

public class Tasks {

    public static void main(String[] args) {
//1. write a program that can remove the palindrome string from a list of String

        //List<String> list = new ArrayList<>();

//2. write a program that can remove the even numbers from a Set of Integers
        Set<Integer> numbers = new TreeSet<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //int odd = 0;
        for(Integer each : numbers){
            if(each%2==0){
                numbers.remove(each);
               //odd+=each;

            }


        }
        //System.out.print(numbers);
        System.out.print(numbers+" ");

    //3. write a program that can remove the duplicated Integers from a List of Integer
           // Do Not change the insertion order



    }
}