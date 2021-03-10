package day16_Scanner;
import java.util.Scanner;
public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("enter your last name");
        String lastName = input.next();

        System.out.println("Are you employed? True or False");
        boolean isEmployed = input.nextBoolean();

        double salary = 0;

        if(isEmployed){
            System.out.println("What is your salary?");
            salary = input.nextDouble();
        }
        input.close();
        System.out.println("Full name: "+ firstName + " "+ lastName);
        System.out.println("Employed");
        System.out.println("Salary: "+ salary);



    }
}
