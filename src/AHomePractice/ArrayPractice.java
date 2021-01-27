package AHomePractice;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 1; i <= 10; i++) {
            //arr[0] = 1;
            arr[i - 1] = i;
            System.out.println("=============================");
            for (int j = 0; j <= 9; j++) {
                System.out.print(arr[j]);
            }
        }
        for(int i =1; i<=10;i++){
            if(arr[i]%2 ==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("==============================");
        for(int each : arr){
    System.out.println(each);
}
    }}








