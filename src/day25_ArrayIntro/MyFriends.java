package day25_ArrayIntro;

import java.util.Scanner;

public class MyFriends {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many friends do you have?");
        int number = scan.nextInt();

        String[] firstName = new String[number];
        String[] lastName = new String[number];
        for(int i=0;i<number;i++){
            System.out.println("Enter firstName: ");
            String f = scan.next();
            f=f.substring(0,1).toUpperCase()+f.substring(1).toLowerCase();
            firstName[i] = f;

            System.out.println("Enter lastName: ");
            String l = scan.next();
            l=l.substring(0,1).toUpperCase()+l.substring(1).toLowerCase();
            lastName[i]= l;
        }// loop is used for initialising the arrays
scan.close();
        for(int i=0;i<number;i++){
            System.out.println(firstName[i]+" "+lastName[i]);

        }




    }
}
