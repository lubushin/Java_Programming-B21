package day16_Scanner;

import java.util.Scanner;
public class AllYourPersonalInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many people do you live with?");
        byte liveWithNumber = input.nextByte();

        if(liveWithNumber>0 && liveWithNumber <= 12){
            if(liveWithNumber<=2){// 1-2 people
                System.out.println("You live with less than 2 people");
            }
            else if(liveWithNumber > 2 && liveWithNumber < 7) // include 3-6
            {
                System.out.println("You live with 3-6 people");
            }
            else {// includes 7-12
                System.out.println("You live with more than 6 people");}
        }
        else{
            System.err.println("Not a valid number of people");
        }

        System.out.println("In want city do you live in?");



    }

}
