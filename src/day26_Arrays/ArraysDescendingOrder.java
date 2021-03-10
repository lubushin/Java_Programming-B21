package day26_Arrays;

import java.util.Arrays;

public class ArraysDescendingOrder {
    public static void main(String[] args) {

        int[] arr = {5,1,2,6,7, 0};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));//ascending order

        int [] descending = new int[arr.length];//[7, 6, 5, 2, 1, 0]

        for(int i = arr.length-1,j=0; i>=0; i--, j++){//descending order
            descending[j] = arr[i];
        }
        System.out.println(Arrays.toString(descending));

                 /*
        1. write a program that cna sort an array of integers in descending
                int[] arr = {5,1,2,6,7, 0};
                output:
                    7 6 5 2 1 0
                    output:
                        [7, 6, 5, 2, 1, 0]
         */
    }
}
