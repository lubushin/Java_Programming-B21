package day16_Scanner;
import java.util.Scanner;
public class DynamicCalculator {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        double num1 = input.nextDouble();

        System.out.println("Enter the second number");
        double num2 = input.nextDouble();

        System.out.println("Enter the operator");
        String operator = input.next();

        input.close();

        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;

            default:
                System.out.println(" is an invalid operator");

        }

        System.out.println(num1 + operator + num2 +"=" +result);

    }
}
