package day29_Methods;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        calculator(10,'+', 50);
       // calculator(scan.nextDouble(),scan.next().charAt(0), scan.nextDouble());
    }

    public static void calculator(double n1,char operator, double n2){

        boolean isValid = operator == '+' || operator == '-'||operator=='*'||operator=='/'||operator=='%';
        if(isValid){
           switch(operator){
               case '+':
                   System.out.println("Addition is: "+(n1+n2));
                   break;
               case'-':
                   System.out.println("Substruction is: "+(n1-n2));
                   break;
               case'*':
                   System.out.println("Multiplication is: "+(n1*n2));
                   break;
               case'/':
                   System.out.println("Division is: "+(n1/n2));
                   break;
               default:
                   System.out.println("Remainder is: "+ (n1 % n2));
           }

        }else{

            System.err.println("Invalid number");
        }

    }





}

