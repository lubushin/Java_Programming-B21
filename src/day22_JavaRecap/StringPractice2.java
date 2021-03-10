package day22_JavaRecap;

import java.util.Scanner;

public class StringPractice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String f = scan.nextLine();

        System.out.println("Enter your last name");
        String l = scan.nextLine();

        String initial = f.substring(0,1).toUpperCase()+ "."+
                l.substring(0,1).toUpperCase();
        System.out.println("Initial = "+initial);
        System.out.println("=====================================");

        System.out.println("Enter the name of sender");
        String sender = scan.nextLine();
        System.out.println("Enter your phone number");
        String phoneNumber = scan.nextLine();
        String message = scan.nextLine();
        String messageBody ="";


        }

   /*
   We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
    */
    }

