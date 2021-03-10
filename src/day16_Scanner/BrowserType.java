package day16_Scanner;
import java.util.Scanner;

public class BrowserType {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter the browser type");
        String browser = input.nextLine();

         input.close();// CLOSE Scanner

        switch (browser){
            case "chrome":
                System.out.println("Chrome is opening");
                break;
            case "firefox":
                System.out.println("Firefox is opening");
            break;
            case "opera":
                System.out.println("Opera is opening");
                break;
            case "safari":
                System.out.println("Safari is opening");
                break;
            case "ei":
                System.out.println("EI is opening");
                break;
            default:
                System.out.println("Not valid");


        }


    }
}
