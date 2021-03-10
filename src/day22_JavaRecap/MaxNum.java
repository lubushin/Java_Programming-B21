package day22_JavaRecap;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -2147483648;
        //user will enter a number that greater than -214748364
        for(int i = 1; i<=5;i++) {
            System.out.println("Enter the number");
            int n = scan.nextInt();//-1,1,3,4,5
            if(n>max){//
                max = n;
            }
            scan.close();
        }
        System.out.println("max = "+max);


   /*  1.  write a program that asks user to enter 5 numbers and retuns the maximum number
    2.  write a program that asks user to enter 5 numbers and returns the minimum number
    3. write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
     ex:
       input:  10
        3
     0utput:
   3 with a remainder of 1 */
    }
}
