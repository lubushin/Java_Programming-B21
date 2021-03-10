package day21_WhileLoops;

import java.util.Scanner;

public class SubstringMethodPractise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = "Ubushin_Lyubov@yahoo.com";
        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.lastIndexOf("@");
        String lastName = email.substring(0, indexOf_);
        String firstName = email.substring(indexOf_+1,indexOfAt );
        String domain = email.substring(indexOfAt + 1,email.lastIndexOf("."));
String fullName = firstName+ " " +lastName;

        System.out.println("Last name: "+lastName);
        System.out.println("First name: "+firstName);
        System.out.println("Domain: " + domain);
        System.out.println("Full name: "+fullName);

        /*
        lastName_firstName@company.com
         */
    }
}
