package day17_Strings;
import java.util.Scanner;
public class StockMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many total shares do you have already?");
        int totalShares = input.nextInt();
        if (totalShares <= 0) {
            System.out.println("not valid");
        }
        System.out.println("What is the value total shares?");
        double totalValue = input.nextDouble();

        System.out.println("Enter the name of the company they have the most shares in");
        String nameOfCompany = input.nextLine();
        input.next();
        System.out.println("What is the value of those shares?");
        double companyValue = input.nextDouble();

        double differenceValue = companyValue - totalValue;
        System.out.println("Difference of the user's total stock market is: " + differenceValue + " valued with the biggest share value");
        System.out.println("Your total stock market holding is: " + totalValue +
                "\n" + "which is made up of " + totalShares + ". " + nameOfCompany +
                "\n" + " the largest company holdings you have of " + companyValue +
                "\n" + " difference between " + differenceValue);





        /*
 - Ask the user how many total shares they have already? (int)
 -> If the user gives 0 or give a negative number none
 of the rest condition should be executed
 - Ask the user how much their total value in the
  stock market is (double)
    - Ask the user to enter the name of the company they
    have the most shares in (String, multiple words)
    - Ask the user the value of those shares (double)
    - Calculate and print the difference of the user's
    total stock market valued with the biggest share value
    - Print in the following format:
        "Your total stock market holding is $totalValue which
        is made up of $totalShareNumber. $companyName is the l
        argest company holdings you have of $companyValue between
        $companyShares."

         */
    }
}
