package day17_Strings;

import java.util.Scanner;

public class CapitalLastN {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first and last name");
        String firstName = inp.next();
        String lastName = inp.next();
        String fullName = firstName+ " "+ lastName;
        String upperCase = fullName.toUpperCase();
        System.out.println(upperCase);

    }
}

/*
 /*write a program to ask user to enter first name and last name
            then print the full name in all upper case*/


