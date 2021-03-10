package day26_Arrays;

public class MinNumberInArray {
    public static void main(String[] args) {
       int[] numbers ={200,567,900,46,78};
       int min=numbers[0];
       for(int i =0; i<=numbers.length-1;i++){
           if(numbers[i]<min){
               min=numbers[i];
           }
       }
        System.out.println("Min: "+min);
        /*
        3. write a program that can return the minimum number from an array of integers

         */
    }
}
