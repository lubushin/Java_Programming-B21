package TestPractice;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      String guestList = "";
        System.out.println("Please enter your guest name");
        String name = scan.next();
        guestList+=name;
        System.out.println("Do you want to enter other guest name");
         String answer = scan.next();
         while(answer.equalsIgnoreCase("Yes")){
             System.out.println("Please enter your guest name");
             name= scan.next();
             guestList+=", "+name;
             System.out.println("Do you want to enter other guest name");
             answer = scan.next();
         }
       System.out.println("Guest list: "+guestList);


     /*   String guestList = "";

    System.out.println("Please enter guest name:");
    String name = scan.next();

    guestList += name;

    System.out.println("Do you want to enter new guest name:");
    String answer = scan.next();

    while(answer.equalsIgnoreCase("Yes")) {
      System.out.println("Please enter guest name:");
      name = scan.next();

      guestList += ", " + name;

      System.out.println("Do you want to enter new guest name:");
      answer = scan.next();
    }

    System.out.println("Guest's list: " + guestList);*/


    }
}
