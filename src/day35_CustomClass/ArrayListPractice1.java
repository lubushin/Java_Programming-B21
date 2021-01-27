package day35_CustomClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

 /*   1. create an Array of string called country names
    2. write a program that can remove all the country names that have length of 10 or greater*/
        String[] countryNames = {"Andorra","United Arab Emirates","Afghanistan","Turkey","United States"," Antigua and Barbuda","Albania"};
        ArrayList<String> countries = new ArrayList<>(Arrays.asList(countryNames));
       countries.removeIf(p-> p.length()>=10);
        System.out.println(countries);

        System.out.println("================================================");

 /* 1. create an Array of LocalDate
    2. write a program that can remove all the dates before August-15-2016*/
        LocalDate[] arr1 = {
                LocalDate.of(2020,11,23),
                LocalDate.of(2012,10,30),
                LocalDate.of(2016,11,23),
                LocalDate.of(2013,11,23),
        };
        LocalDate d1 = LocalDate.of(2016,8,15);
        ArrayList<LocalDate> dates = new ArrayList<>(Arrays.asList(arr1));
        dates.removeIf(p->p.isBefore(d1));
        System.out.println(dates);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-yyyy, EEEE");

        for(LocalDate each : dates){
            System.out.println(each.format(df));
        }

    }
}
