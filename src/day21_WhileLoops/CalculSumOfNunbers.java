package day21_WhileLoops;
import java.util.Scanner;
public class CalculSumOfNunbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result =0;

            for (int i = 0; i < 1;)//5+10=15+20=35...
            {System.out.println("Enter number: ");
                int num =scan.nextInt();
                result+=num;

                if(num<0){//if num negative, it will stop the code
                    break;
                }
        }
            scan.close();
        System.out.println("Result = "+result);
        /*
   1.  Write a program that calculates the sum of numbers
   entered by the user until user enters a negative number.
     hint: you need an infinite loop

         */
    }
}
