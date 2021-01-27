package day29_Methods;

import java.util.Arrays;

public class VoidMethodsMaxMinNumbers {
    public static void main(String[] args) {
        int[] a1 = {100, -200, 30, 50, 40, 59, 700, 0, 1, 2};
        arrayMaxNumb(a1);
        arrayMinNum(a1);

        int[] a2 = {1, 2, 4, 7, 800, 1000, 5, 6, 96, 45};
        arrayMaxNumb(a2);
        arrayMinNum(a2);
        int[] a3 = {1, 3, 5, 7, 9, 80, 2, 5, 6, 7};
        arrayUniqueElements(a3);

    }

    public static void arrayMaxNumb(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Maximum number: " + arr[arr.length - 1]);
        System.out.println("======================================");

        //Interview code:
        int max = arr[0];
        for (int eachElement : arr) {
            if (eachElement > max) {
                max = eachElement;
            }
        }
        System.out.println("Maxumum number is: " + max);
    }

    public static void arrayMinNum(int[] arr) {
        int min = arr[0];
        for (int eachElement : arr)
            if (eachElement < min)
                min = eachElement;
        System.out.println("Minimum number is: " + min);
    }

    public static void arrayUniqueElements(int[] arr) {
        for (int eachElement : arr) {
            int count = 1;
            for (int each2 : arr) {
                if (eachElement == each2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(eachElement + " ");
            }
        }

    }
}
        /*
    1. create a function that can print out the maximum number from any given integer array
    2. create a function that can print out the minimum number from any given integer array
    3. create a function that can print the unique elements from the array
*/



