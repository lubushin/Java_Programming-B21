package day54_Map_Recap;

import java.time.Month;

public class TestEnums {
    public static void main(String[] args) {
        String browserName = "Cybertek";
        Browsers browsersName2 = Browsers.Chrome;
     switch (browsersName2){
         case Chrome:
             System.out.println("Chrome selected");
             break;
         case Firefox:
             System.out.println("Firefox selected");
             break;
         default:
             System.out.println("Safari selected");
     }

     String monthName = "Python";
     MonthName monthName2 = MonthName.January;
     DaysInWeek day = DaysInWeek.Friday;
     ComputerOS os = ComputerOS.MacOs;



    }
}
