package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scan.nextInt();
        scan.close();
        //char grade = ' ';
        String grade = "";
        if(score>=0 && score<=100){
         if(score>=90){grade = "Excellent";}
         else if(score>=80){grade = "Great";}
            else if(score>=70){grade = "Good";}
            else if(score>=60){grade = "Passed";}
            else {grade = "Fail";}
            //grade = (score>=90)?"Excellent" : (score>=80)?"Great"
            //:(score>=70)?"Good":(score>=60)?"Passed":"Failed";
        }else
        {
            grade = "Invalid";
        }

        System.out.println(grade);
    }
}
