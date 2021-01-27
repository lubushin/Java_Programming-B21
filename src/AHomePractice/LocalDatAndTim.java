package AHomePractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDatAndTim {

    public static void main(String[] args) {

        LocalDate tomorrow = LocalDate.of(2020,12,21);
        System.out.println(tomorrow);
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println("=========================================");

        LocalTime time = LocalTime.of(20,45);
        System.out.println(time);

        LocalDateTime t2 = LocalDateTime.of(2020,12,23,7,24);
        System.out.println(t2);

        System.out.println("=======================================================");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, MMMM/dd/yyyy, h:mm:ss a ");
LocalDateTime dt1 = LocalDateTime.now();
        System.out.println(dt1.format(df));
    }
}
