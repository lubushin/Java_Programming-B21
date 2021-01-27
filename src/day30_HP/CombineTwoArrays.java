package day30_HP;

import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {
        int[] a1 = {2,4,90,30};
        int[] a2 = {9,6,40,60,20};
        CombineTwoArrays(a1,a2);
    }

    public static void CombineTwoArrays(int[] arr1, int[] arr2){
    int[] arr3 = new int[arr1.length + arr2.length];
    int i = 0;

    for(int each : arr1){
        arr3[i++] = each;
    }
 for(int each : arr2){
     arr3[i++] = each;
 }
Arrays.sort(arr3);
 System.out.println(Arrays.toString(arr3));
    }
}
