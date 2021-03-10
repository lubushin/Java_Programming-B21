package day27_ForEachLoop;

import java.util.Arrays;

public class CombainTwoArrays {
    public static void main(String[] args) {
       int[] arr1 = {10,20,40,70,40,60,98,300};
       int[] arr2 ={-1,-2,-3,-4,-5,-7,-8};

       int[] arr3 = new int[arr1.length + arr2.length];//array must have the capacity to contain arr1 and arr2
       int j = 0; //represents the index numbers of arr3

        for(int each : arr1){// each:1,2,3,4
           arr3[j++] = each;
           /*
            arr3[0} = 1;
            arr3 [1] = 2;
            arr3 [2] = 3;
            arr3 [3] = 4;
            */
        }
        for(int each : arr2){//5,6,7
            arr3[j++] = each;
            /*
            arr3 [4] = 5;
            arr3 [5] = 6;
            arr3 [6] = 7;
             */
        }

        System.out.println(Arrays.toString(arr3));
        /*
         write a program that can combine two int arrays and then create the third array
            arr1 = {1,2,3,4};
            arr2 ={5,6,7};
            output:
                arr3 = {1,2,3,4,5,6,7}

         */
    }
}
