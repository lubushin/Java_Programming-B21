package INTERVIEW_Codes;

import java.util.Scanner;

public class IsNumberPrime {
    public static void main(String[] args) {
        System.out.println("Please enter the number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
       // int num =17;
        boolean isPrime = true;
        for(int i=2;i<num; i++){

            if(num%i==0){
                isPrime = false;
            }
            if(num ==1){
                isPrime = true;
            }
        }
        System.out.println(isPrime);
    }
}


