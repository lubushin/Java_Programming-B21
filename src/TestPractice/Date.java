package TestPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {

        LocalDate yesterday = LocalDate.of(2019,12,15);
        System.out.println(yesterday);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM dd yyyy");
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.format(df));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now.format(tf));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MM/dd/yyyy");
        LocalDateTime dt = LocalDateTime.of(2020,12,7,17,51);
        System.out.println(dt);
        System.out.println(dt.format(dtf));

    }
}
