package day26_Arrays;

public class MaxNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {1,20,3,400,5,6,70};
        int max = numbers[0];
        for(int i =1;i<=numbers.length-1; i++){
           if(numbers[i] > max){

    max =numbers[i];
            }

        }
        System.out.println("Max: "+max);


        /*
        2. write a program that can return the maximum number
        from an array of integers
         */
    }
}
