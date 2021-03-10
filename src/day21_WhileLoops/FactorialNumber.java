package day21_WhileLoops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        double num = scan.nextInt();
        double result =1;
        //3: 3*3*1
        //4: 4*3*2*1
        //5: 5*4*3*2*1  i>=1 - multip repeted
        for(double i = num; i>=1;i--){
           result *=i;
        }
        System.out.println("Result = "+result);
        /*
       Write a program that can return the factorial number
       of any given number
            Ex:
                input: 5
         output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
         */
    }
}
