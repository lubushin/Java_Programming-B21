package day22_JavaRecap;
import java.util.Scanner;
public class DivideTwoNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int count = 0;//number of times we can substrct b from a
        while(a>b){
            a-=b;
            count++;
        }
        System.out.println(count+ " with remainder of "+a);

        /*
        write a program that can divide two numbers without
        using / & % operators and returns the division and remainder
     ex:
       input:  10
        3
     0utput:
   3 with a remainder of 1
       10 / 3 = 3.333;
        10 - 3 = 7;
        7 - 3 = 4;
        4 - 3 = 1;
        3 times subtraction, numerator at the end is 1
        result: 3 with a remainder of 1
        19 / 2
				19 - 2 = 17;
				17 - 2 = 15;
				15 - 2 = 13;
				13 - 2 = 11;
				11 - 2 = 9;
				9 - 2 = 7;
				7 - 2 = 5;
				5 > 2 = 3
				3 - 2 = 1;
				9 times execution, numerator is 1
				result: 9 with a remainder of 1
        AS LONG AS NUMERATOR IS GREATER THAN OR EQUAL  DENOMINATOR,
        DENOMINATOR CAN BE KEEP SUBTRACTED FROM NUMERATOR.
        WHATEVER WE HAVE LEFT IN NUMERATOR WILL BE THE REMAINDER
         */

//AS LONG AS NUMERATOR IS GREATOR OR EQUAL DENOMINATOR,
// DENOMINATOR CAN BE KEEP SUBTRACTED FROM NUMERATOR
    }
}
