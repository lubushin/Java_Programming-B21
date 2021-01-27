package INTERVIEW_Codes;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter yout number to find if it is a prime number ");
        int number = input.nextInt();
        int count = 0;

        for(int i =1; i<=number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==2){//divisible only two times2
            System.out.println(number+ " is a prime number");
        }else if(number==1){
            System.out.println(number + " is a prime number");
        }
else
            {
            System.out.println(number+ " is not a prime number");
        }
    }
}
