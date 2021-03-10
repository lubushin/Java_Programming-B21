package day13_Switch;

public class DaysOfMonth {
    public static void main(String[] args) {
        //28;29;30;31 days
        int year = 2010;
        int month = 10;
        boolean has28or29Days = month == 2;
        boolean has30Days = month ==4 || month == 6 || month ==9 || month ==11;
        String result = "";

        if (month > 0 && month < 13) {
            if (month == 2) {
                if (year % 4 == 0) {
                    result = "29 days";
                } else {
                    result = "28 days";
                }
            } else if (has30Days) {
                result = "30 days";
            } else {
                result = "31 days";
            }
        } else {
            result = "Invalid month";
        }

        System.out.println(result);


        //month == 1, 3,5,7,8,10,12 = 31;

        // write a program that can find the number of days in a month
    }
}
