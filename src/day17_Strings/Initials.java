package day17_Strings;
import java.util.Scanner;
public class Initials {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = inp.next();

        System.out.println("Enter last name");
        String lastName = inp.next();

        char firstLN = lastName.charAt(0);
        char firstFN = firstName.charAt(0);
        String initials = firstName.charAt(0) + "."+lastName.charAt(0);
        System.out.println("Initials: " + initials);


        /* write a program to ask use to enter first name and
        last name then print the initials
       (first letter of first name + first letter of last name)
         */
    }
}
