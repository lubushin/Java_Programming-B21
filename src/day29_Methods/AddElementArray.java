package day29_Methods;

import java.util.Arrays;

public class AddElementArray {
    public static void main(String[] args) {
int[] arr = {10,20,30,40};
        addElement(arr,50);
int[] arr1 = {3,4,5,6,7};
addElement(arr1,67);

    }
//                                   {1,2,3}     4
    public static void addElement(int[] arr, int num){
        int[] result = new int[arr.length+1];
        for(int i =0; i<=arr.length-1;i++){
           result[i] = arr[i];
        }

result[result.length-1] = num;// last index
        System.out.println(Arrays.toString(result));

    }

}
