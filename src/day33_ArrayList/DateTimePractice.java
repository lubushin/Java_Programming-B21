package day33_ArrayList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateTimePractice {
    public static void main(String[] args) {


      /*  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMMM/dd/yyyy ");
        LocalDateTime d1 = LocalDateTime.of(2020,11,24,13,00);
        System.out.println(d1.format(dtf).replaceFirst("PM","pm"));

        System.out.println("======================================================");
DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM-dd, EEE");
        LocalDate[] days = new LocalDate[5];
        for( int i =0; i< days.length-1;i++){
            days[i] = LocalDate.now().plusDays(i+1);
        }
        System.out.println(Arrays.toString(days));
        for(LocalDate each : days)
            System.out.println(each.format(df));*/

        System.out.println("============================================================");
        //who is oldest or youngest
        String[] friends = {"Ben", "Steve", "David", "Rick", "Flavio"};
        LocalDate[] dOfB ={ LocalDate.of(1954,11,24),
                            LocalDate.of(1959, 12, 26),
                                LocalDate.of(1969, 12, 25),
                LocalDate.of(1965,11,26),
                LocalDate.of(1969, 8,13)};
        String nameOfOlder = friends[0];
        LocalDate older = dOfB[0];
        int ageOfOlder;
        String nameOfYounger = friends[0];
        LocalDate younger = dOfB[0];
        int ageOfYounger;
        for(int i =0; i<=dOfB.length-1;i++) {

            if (dOfB[i].isBefore(older)) {
                older = dOfB[i];

                nameOfOlder = friends[i];
            }
            if (dOfB[i].isBefore(younger)) {
                younger = dOfB[i];
                nameOfYounger = friends[i];
            }
        }
        System.out.println(nameOfOlder+ " "+older);
        System.out.println(nameOfYounger+" "+younger);

    }

}
/*
use the LocalDate & Time get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
    2. create an array of LocalDate and store the next 10 day's dates, use for each loop to print each Date in the following formar:
                MonthName/Day, Name
                ex:
                    November/25, Wednesday
    3. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
 */
