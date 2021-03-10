package day18_Strings;
import java.util.Scanner;
public class SubstringMethod2 {
    public static void main(String[] args) {
        String str = "Today is Monday";
        String day1= str.substring(9);
        System.out.println(day1);
        System.out.println("======================================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstName = scan.next();
        firstName = firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
        System.out.println(firstName);

        System.out.println("Enter the last name");
        String lastName = scan.next();
        lastName = lastName.substring(0,1).toUpperCase()
                + lastName.substring(1).toLowerCase();

        System.out.println(lastName);
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);


    }
}
