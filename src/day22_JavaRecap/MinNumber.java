package day22_JavaRecap;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 2147483647 ;//possible largest integer
        for(int i = 1; i<=5; i++);
        {
            System.out.println("Enter a number");
            int n = scan.nextInt();
            if (n < min) {
                min = n;
            }
        }
scan.close();
        System.out.println("Min number is: "+min);
    }
}
