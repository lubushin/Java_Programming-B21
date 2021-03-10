package day17_Strings;
import java.util.Scanner;
public class TravelCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cost = 0;

        System.out.println("Do you have a valid passport");
        String validPassport = input.next();

        if(validPassport.equalsIgnoreCase("yes")){
            cost = 0;
            System.out.println("What country do you want to go to?");

            input.nextLine(); // accept the enter input

            String country = input.nextLine();
            System.out.println(country);

            System.out.println("How many bags will you have?");
            byte bags = input.nextByte();

            cost +=(bags * 50);// cost = cost +(bag * 50)
            System.out.println("How many people are traveling with");
            short numOfPeople = input.nextShort();
            if(numOfPeople >=3){
                cost-=300;// cost = cost - 300;
            }else {
                cost -=(numOfPeople *100);}
            System.out.println("Enter the name of the people you will travel");
            input.nextLine();
            String namesOfPeople = input.nextLine();
            System.out.println("Your ticket is booked to "+country+ ". We have charged extra for the "+bags
                    + "bags but you are traveling with "+ namesOfPeople + " so ve are giving the discount"
            + "Your total cost: " + cost);

        }else
        {

        }


    }
}
