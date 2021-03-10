package day25_ArrayIntro;

import java.util.Scanner;

public class NameOfTheMonths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] month = {"Jan", "Feb", "Mar","Apr", "May", "June", "July",
        //                  0      1      2     3     4       5       6
                "Aug","Sept","Oct","Nov","Dec"};
        //        7      8     9      10  11
        System.out.println("Enter the number: ");
        int number = scan.nextInt();//1
        System.out.println(month[number-1]);
        System.out.println("========================================");
        String[] day= {"Mon","Tues","Wed","Thurs","Frid","Sat","Sun"};
        System.out.println("Enter the number");
        int num = scan.nextInt();
        System.out.println("Today is "+day[num-1]);



    }
}
