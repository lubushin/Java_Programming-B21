package day13_Switch;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        String in = input.next();
        float price = 10.0f;
        if(in == "chicken" || in == "burger"){
            System.out.println(price);
        }
        else{
            System.out.println(" Soda: " + price);
        }


        /*
        a fast food company has two main order types, burger meal and chicken meal.
both have the same prices.
so if a cashier enters "burger" or "chicken " he will get the same price

a float : 10.0

this test can be done with one if.

check if in (string variable) equals "burger" or "chicken"  and
output the price 10.0

also if input is "soda" output 2.0 (do this with another if)
         */
    }
}
