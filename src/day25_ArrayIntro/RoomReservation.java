package day25_ArrayIntro;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        while(true)
        {
        System.out.println("Which room wood you like to select?");
        System.out.println("\t\tKing bed == $120");
        System.out.println("\t\tQueen bed ==$100");
        System.out.println("\t\tSingle bed ==$80");

        String word = scan.nextLine().toLowerCase();

        while (!(word.equals("king bed") || word.equals("queen bed")
                || word.equals("single bed"))) {
            System.out.println("Invalid Entry, Please Re-Enter");
            word = scan.nextLine().toLowerCase();}
            //to make sure that user is using correct answer
            total += (word.equals("king bed")) ? 120 : (word.equals("queen bed")) ? 100 : 80;

            System.out.println("Would you like to select another room?");
            String a = scan.nextLine().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))) {

                System.out.println("Invalid Entry, PLease Re-Enter");
                System.out.println("Would you like to select another room?");
                a = scan.nextLine().toLowerCase();
            }
            if (a.equals("no")) {
                break;
            }

        }
    }
}
