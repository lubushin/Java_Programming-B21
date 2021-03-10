package day23_NestedLoop;

import java.util.Scanner;

public class FirstUpperLastLower {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char f = str.charAt(0);
        char l = str.charAt(str.length()-1);

        boolean start = f>='A' && f<='Z';//Asci A=: 65; Z = 90//true
        boolean end = l>=97 && l<=122;//lower case//true
        if(start && end){//true && true
            System.out.println("True");
        }else
        {
            System.out.println("False");
        }


/*
2.  Write a program that asks user to enter a string. If string started with uppercase and ends with lowercase letter then print true, otherwise print false
        Ex:
           Input: Cybertek
           output: true
           Input: CyberteK
           output: false
 */
    }
}
