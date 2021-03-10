package day18_Strings;
import java.util.Scanner;
public class HalfWord {
    public static void main(String[] args) {
        /*
        Write a program that will print out
        first half of the word twice.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        word = word.substring(0,2) + word.substring(0,2);
        System.out.println(word);






       /* System.out.println("Enter a word");
        String word = scan.next();
        word = word.substring(0,2) + word.substring(0,2);
        System.out.println(word);*/





       /* System.out.println("Enter the word");
        String word = scan.next();
        word = word.substring(0,2)+ word.substring(0,2);
        System.out.println(word);
        System.out.println("==============================");*/
        /*
        Write a program that will reverse a string. Your program should reverse a string only 5 characters long. If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console.


         */

        String name = "Lyubov Ubuhsin";
        int n1 = name.length();
        System.out.println(n1);//14, but Last Index - 13(0,1,2...)
        String name2 = "Lyubov";
        int n2 = name2.length();
        System.out.println(n2);//6
        int lastIndex = name2.length()-1;
        System.out.println(lastIndex);//5
    }
}
