package INTERVIEW_Codes;

import java.util.Scanner;

public class InterV_MinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       /* int min = -2147483647;
        int max = 2147483647;
        for(int i =1;i<=2;i++) {
            System.out.println("Enter numbers");
            int n = scan.nextInt();
            if (n < min) {
                min = n;
            } else if (n > max) {
                max = n;
            }
        }
        System.out.println("M" +max);
        System.out.println("min"+min);*/

        int min = 2147483647;//possible bigger number for integer
        int max = -2147483647;//possible smaller number for integer
        for(int i=1; i<=5; i++) {
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if (n < min) {
                min = n;// if the input is smaller than previous min number
            }
            if (n > max) {
                max = n;// if the input is greater than previous max number
            }
        }
        scan.close();
        System.out.println("min = "+min);
        System.out.println("max = "+max);

    }
}