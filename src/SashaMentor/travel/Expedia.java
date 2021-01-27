package SashaMentor.travel;

import java.util.Scanner;

public class Expedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter ticket cost");
        String airplaneCost =scan.next();

        System.out.println("Please enter hotel cost");
        String hotelCost = scan.next();

        TravelCalculator travelCalculator1 = new TravelCalculator();
        travelCalculator1.airFare(airplaneCost,hotelCost);

    }


}
