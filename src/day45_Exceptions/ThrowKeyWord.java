package day45_Exceptions;

import java.util.Scanner;

public class ThrowKeyWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if(age < 0 || age >150){
            throw new RuntimeException("Invalid Age Number entered"+age);
        }

        if(age>=21){
            System.out.println(("Eligible"));
        }else{
            System.out.println("Not Eligible");
        }

scan.close();
    }
}
