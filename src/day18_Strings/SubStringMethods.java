package day18_Strings;
import java.util.Scanner;
public class SubStringMethods {
    public static void main(String[] args) {
        String str = "I love Java Programming";
        String name = "Java";
        str=str.substring(7,11);//Returned => "Java"
        System.out.println(str);
        System.out.println("=========================");
        String str1 = "Today is Monday";
        String name1 = str1.substring(9,14+1);
        System.out.println(name1);
        
        String email = "lubushin@yahoo.com";
        String domain = email.substring(9, 13+1);
        System.out.println("Domain of the email is:  " + domain);
        System.out.println("======================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the words");
        String word1 = "lYUbov";
        String char1 = word1.substring(0,1).toUpperCase();
        String rest = word1.substring(1,word1.length()-1).toLowerCase();
        System.out.println(word1);
        System.out.println(rest);
        word1 = char1+rest;
        System.out.println(word1);
        System.out.println("===========================");

        System.out.println("Enter your first name");
        String f = scan.nextLine();

f = f.substring(0,1).toUpperCase() + f.substring(1, f.length()-1+1).toLowerCase();


        System.out.println("Enter your last name");
        String l = scan.nextLine();
        l = l.substring(0,1).toUpperCase() + l.substring(1, l.length()).toLowerCase();

        System.out.println("First name is: "+ f);
        System.out.println("Last name: " + l);
        String fullName = f +" "+l;
        System.out.println(fullName);





    }
}
