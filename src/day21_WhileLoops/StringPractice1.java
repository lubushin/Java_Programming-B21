package day21_WhileLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String word = scan.nextLine();//Java
        //int lastIndex = word.length()-1;


        System.out.println("==================================");

        while (true) {

            System.out.println("Enter building number:");
            String building = scan.next();

            scan.nextLine();

            System.out.println("Enter your street:");
            String street = scan.nextLine();

            System.out.println("Enter apartment number:");
            String apartment = scan.next();

            scan.nextLine();

            System.out.println("Enter the city:");
            String city = scan.nextLine();

            System.out.println("Enter the state");
            String state = scan.nextLine();

            System.out.println("Enter your zipCode");
            int zipCode = scan.nextInt();
            String fullAddress = building + " " + street + ", Apt#" + apartment
                    + "\n" + city + ", " + state + " " + zipCode;
            System.out.println(fullAddress);
            System.out.println("Would you like to continue? Yes, N0");
            String answer = scan.next();

            if (answer.equalsIgnoreCase("no")) {
                break;
            }

        }
    }
}
