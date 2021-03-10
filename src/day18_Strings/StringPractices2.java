package day18_Strings;
import java.util.Scanner;
public class StringPractices2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Apple product name");
        String product = scan.nextLine();
        product = product.replace(" ", "").toLowerCase();
        switch (product) {
            case "macbook":
                System.out.println("Which model MacBook whould you like?");
                String model = scan.nextLine();
                if (model.equalsIgnoreCase("air")) {
                    System.out.println("MacBook Air is $2,400");
                }
                if (model.equalsIgnoreCase("pro")) {
                    System.out.println("MacBook pro is $2,500");
                } else {
                    System.err.println("Invalid model for MacBook");

                }

                break;
            case "iphone":
                System.out.println("Which model Iphone would you like?");
                String model2 = scan.nextLine().toLowerCase();
                if (model2.equals("12")) {
                    System.out.println("Iphone 12 is $1000");
                }
                break;
            case "ipode":
                System.out.println("Which model of Ipod");
                String model3 = scan.nextLine().toLowerCase();
                switch (model3) {
                    case "air":
                        System.out.println("Ipod air is $500");
                        break;
                    case "pro":
                        System.out.println("Ipod pro is $500");
                        break;
                    case "mini":
                        System.out.println("Ipod mini is $300");
                        break;
                    default:
                        System.err.println("Invalid model for Ipod");
                }
                break;

            default:
                System.err.println("Invalid product name");

        }
        }
    }

