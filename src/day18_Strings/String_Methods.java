package day18_Strings;
import java.util.Scanner;
public class String_Methods {
    public static void main(String[] args) {
      //CONCATENATION
        String str = "Cybertek";
        str = str.concat(" School");
        System.out.println(str);
        String str2 = "Cybertek";
        str = str2 + " School";// "+" - can concatenate anything:integers
        System.out.println(str);
        System.out.println("=======================================");
    //UPPER CASE; LOWER CASE
        String name = "bank of america";
    name = name.toUpperCase();//Create new Version: BANK OF AMERICA
        System.out.println("name = " + name);
        name = name.toLowerCase();// bank of america
        System.out.println("name = " + name);
        System.out.println("======================================");
    //TRIM
        String t1 = "     Hello";
        t1 = t1.trim();
        System.out.println(t1);
        String t2 = "Hello    Friends";// do not remove spaces btw Words
        t2 = t2.trim();
        System.out.println(t2);
        System.out.println("======================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName =   scan.nextLine();
        firstName = firstName.trim();

        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        lastName = lastName.trim();

        System.out.println("FirstName is: " +firstName);
        System.out.println("lastName = " + lastName);

    
    
    }
}
