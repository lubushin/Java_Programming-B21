package day17_Strings;
import java.util.Scanner;
public class Scanner_Review2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name");
        String product = input.nextLine();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("enter the quantity");
        int quantity = input.nextInt();

        input.nextLine();// the ENTER from the above method will be absorbed

        System.out.println("Enter the full name");
        String fullName = input.nextLine();

        System.out.println("Enter your address");
        String address = input.nextLine();

        System.out.println(fullName + " your order for "+ quantity + " "+product
                + " has been placed. Your total is: " + (price*quantity));

        System.out.println(product);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(fullName);
        System.out.println(address);





    }
}
