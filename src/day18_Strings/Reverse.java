package day18_Strings;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String word = scan.next();
        int l = word.length();
        if(l == 5 ){
            System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
        }else if(l>5){
            System.out.println("Too long");
        }else {
            System.out.println("Too short");
        }


        /*
        Write a program that will reverse a string. Your program
        should reverse a string only 5 characters long.
        If word is shorter, display message: "Too short!".
        If word is longer, display message: "Too long!".
        Otherwise, reverse this word and print out result into the
        console.

            Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word");
            String word = scan.next();

        int l = word.length();
        if(l==5){
            System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
        }else if(l>5){
            System.out.println("Too long!");
        }else{
            System.out.println("Too short!");
        }
*/

    }
}
