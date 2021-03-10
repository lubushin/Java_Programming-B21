package day17_Strings;
import java.util.Scanner;
public class Longest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name1 = "Lyubov";
        String name2 = "Koramazov";

        int name1L = name1.length();
        int name2L = name2.length();
        if(name1L > name2L){
            System.out.println("Longest name: "+name1);
        }else{
            System.out.println("Longest name: "+name2);
        }


        /*String one ="Kim";
        String two = "Kema";
       int oneL = one.length();
       int twoL = two.length();
       if(oneL>twoL){
           System.out.println(one);
       }else{
           System.out.println(two);
       }*/

        /*
        4. write a program that asks user to enter two string
            then print the longest string
         */

        System.out.println("Enter a String");
        String str1 = inp.next();

        System.out.println("Enter a String");
        String str2 = inp.next();

        int str1L = str1.length();
        int str2L = str2.length();
        if(str1L > str2L){
            System.out.println(str1);
        }else{
            System.out.println(str2);
        }


    }
}
