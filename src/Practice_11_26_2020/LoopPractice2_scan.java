package Practice_11_26_2020;

import java.util.Scanner;

public class LoopPractice2_scan {
    public static void main(String[] args) {
        /*salary calculator:
        hourly rate;
        weeklyHour;
        taxRates: 30%;
        Ask if user want to continue
         */

        Scanner scan = new Scanner(System.in);
        double hourlyRate=0;
        int weeklyHour = 0;
        String answer="";

while(!answer.equals("no")) {
    System.out.println("Enter your hourly rate");
    hourlyRate = scan.nextDouble();

    System.out.println("HOw many hours you work in a week");
    weeklyHour = scan.nextInt();

    double salary = weeklyHour * hourlyRate * 52;
    System.out.println("Your salary is ");

    double tax = salary * 0.3;
    System.out.println("Your tax is : " + tax);

    double salaryAfterTax = salary - tax;
    System.out.println("Your salary after tax: " + salaryAfterTax);

    System.out.println("Would you like to continue?");
    answer = scan.next().toLowerCase();

    //  second !-gives invalid cond; <= first give:valid condition-give first, then "!"-makes invalid
    while(! (answer.equals("yes") || answer.equals("no"))){//Invalid answer
        System.out.println("Would you like to continue?");
        answer = scan.next().toLowerCase();

    }
}

    }
}
