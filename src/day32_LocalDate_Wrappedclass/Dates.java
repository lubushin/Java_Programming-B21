package day32_LocalDate_Wrappedclass;

import java.time.LocalDate;
public class Dates {

    public static void main(String[] args) {
       LocalDate yesterday = LocalDate.of(2020,11, 22);
        System.out.println(yesterday);

        //LocalDate d1 = LocalDate.of(2019, 2, 29);
        //System.out.println(d1);

        System.out.println(yesterday.isLeapYear());//leap =>true, others=>false
        // number is divisible by 100

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate DOfB = LocalDate.of(1968, 10, 18);
        System.out.println(DOfB);
        System.out.println(DOfB.isLeapYear());
    }
}
