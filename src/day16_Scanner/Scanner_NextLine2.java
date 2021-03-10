package day16_Scanner;
import java.util.Scanner;
public class Scanner_NextLine2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your phone number");
        long phoneNumber = input.nextLong();
        input.nextLine(); // THE PURPOSE - to accept the enter key

        System.out.println("Enter you full name");
        String fullName = input.nextLine();

        System.out.println("Name: "+ fullName);
        System.out.println("Age: "+age);
        System.out.println("Phone number is: "+ phoneNumber);
    }
}
