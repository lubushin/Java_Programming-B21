package day15_Scanner;
import java.util.Scanner;
public class Height {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the height: ");
    double height = scan.nextDouble();
        System.out.println("The hight is: " + height);

        System.out.println("Enter the shoe size: ");
        byte shoeSize = scan.nextByte();
        System.out.println("The shoe size is: "+shoeSize);

        System.out.println("Enter if you like to wear hats or not : True or False ");
        boolean hat = scan.nextBoolean();
        System.out.println("Yes :"+hat);

  /*
  - Ask the user to enter their height (double), shoe size (byte), and if they like to wear hats (boolean).
  Print out the information

   */

    }
}
