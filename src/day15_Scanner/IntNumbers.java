package day15_Scanner;
import java.util.Scanner;
public class IntNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter number one: ");
        int numOne = inp.nextInt();
        System.out.println("Enter number two: ");
        int numTwo = inp.nextInt();

        int result = numOne * numTwo;


        System.out.println( numOne + " * " + numTwo+ " = " + result);


        /*
        - Create a program that will take two int numbers and multiply them. Print in the following way:
    %numOne x %numTwo = %result
    Ex: 3,5 --> 3 x 5 = 15
    Ex: -2,30 --> -2 x 30 = -60
         */

    }
}
