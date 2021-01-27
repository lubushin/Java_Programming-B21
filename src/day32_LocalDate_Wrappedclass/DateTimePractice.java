package day32_LocalDate_Wrappedclass;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTimePractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter first person BY, month, and day");
        LocalDate DofB1 = LocalDate.of(scan.nextInt(), scan.nextInt(),scan.nextInt());

        System.out.println("Enter second person BY, month, and day");
        LocalDate DofB2 = LocalDate.of(scan.nextInt(), scan.nextInt(),scan.nextInt());
        scan.close();

        if(DofB1.isBefore(DofB2)){
            System.out.println("First person is older");
        }else if(DofB2.isBefore(DofB1)){
            System.out.println("Second person is older");
        }else {
            System.out.println("same age");
        }

        //current
        // How old they will be in 30 years
        int age1 = LocalDate.now().plusYears(30).getYear()-DofB1.getYear();
        int age2 = LocalDate.now().plusYears(30).getYear()-DofB2.getYear();


           /* int after1 = age1 + 30;
           int after2 = age2 + 30;*/


        System.out.println("After 30 years , person A will be: "+ age1);
        System.out.println("After 30 years , person B will be: "+ age2);
LocalDate DofB3 = LocalDate.of(1980,12,5);
        System.out.println(calculateAge(DofB3,20)+ " years old");

    }

    public static int calculateAge(LocalDate DofB, int year){
        return LocalDate.now().plusYears(year).getYear()- DofB.getYear();

    }
}

