package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your gender: ");
        String gender = scan.next();

        System.out.println("What is your age: ");
        int age = scan.nextInt();
scan.nextLine();
        System.out.println("Enter full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter zip code: ");
        int zipCode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your country: ");
        String country = scan.nextLine();

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter you company name: ");
        String companyName = scan.nextLine();
        System.out.println("Enter your address: ");
        String address = scan.nextLine();
    }
}
