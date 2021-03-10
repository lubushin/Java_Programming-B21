package day24_NeateedLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        while(true){
            System.out.println("Enter a number");
            int n1 = scan.nextInt();

            System.out.println("Enter a number");
            int n2 = scan.nextInt();
            result = n1+n2;
            System.out.println("Result: " + result);

            scan.nextLine();
            System.out.println("Would you like to continue");
            String a = scan.nextLine().toLowerCase();
            while(!(a.equals("yes")|| a.equals("no"))){
                System.out.println("Invalid entry, Please Re -Enter");
                System.out.println("Would you like to continue");
                a = scan.nextLine().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }

        }




        /* 1. write a program that ill ask user to enter two numbers and calculates the sum of those two numbers. then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the anser is neither yes or no, the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outter loop need to be an infinite loop

    3. write a program that can find the unique characters from a string
            Ex:
                 str = "AABCCD";
                 output:
                        BD
            approach:
                    find the frequncy of each character one by one, and if the frequency of the character is equal to 1, it means it's unique
             In previous section we leaned how to find the frequency of one character. you will need to repeat the same steps
*/
    }
}
