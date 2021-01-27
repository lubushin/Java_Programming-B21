package day31_MethodOverLoading;

import java.util.Arrays;

public class sortArrays {
    public static void main(String[] args) {
        int[] arr = {2,4,9,4,8,1,9,6};
        sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }

    public static int[] sort(int[] arr){
        Arrays.sort(arr);
        
        int reversedArray[] = new int[arr.length];

      for(int i = arr.length-1, j=0; i>=0; i--, j++){
          reversedArray[j] = arr[i];
      }
       return reversedArray; 
        
    }
}

/*
sort: sorts in descending order
    int[]
    double[]
    char[]
    String[]
 */
