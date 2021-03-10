package day17_Strings;
import java.util.Scanner;
public class DocAppointment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Ask the user how many days they have sick(byte)
        > If they have been sick for 1-3 days print "Drink water and get some rest, but we can schedule an appointment for next week"
        > If they have been sick for 4-7 days print "We can schedule an appointment for two days"
        > If they have been sick for more than 7 days print "Come in immediately"
         */
        System.out.println("How many days have you been sick?");
        byte sickDays = input.nextByte();
        if(sickDays >=1&& sickDays<=3){
            System.out.println("Drink water and get some rest, but we can schedule an appointment for next week");
        }else if(sickDays<=7){
            System.out.println("We can schedule an appointment for two days");}
        else if(sickDays>7){
            System.out.println("Come in immediately");
        }

       /* System.out.println("Are you taking any medicine?");
        String medicine = input.next();
        if(medicine = yes ){
            System.out.println("What kind medicine are you taking?");
            input.nextLine();
        }
        */

        /*
    - Ask the user if they are taking any medicine (String - yes or no)
        > If they are taking medicine ask them what kind of medicine they are taking
        (String, multiple words)
        > If they are not, ask them if they think they need any (String - yes or no)
            > If they say yes print "We can prescribe medicine after the appointment"
            > If they say no print "Eat some soup"
    - Ask the user if they have insurance (boolean)
        > If they have insurance(true) print "Okay see you at the appointment"
        > If they don't have insurance (false) print "Okay we can discuss payment after the appointment"

         */
        System.out.println("Do you have an Insurance?");
boolean insurance = input.nextBoolean();

if(insurance == true){
    System.out.println("Okay see you at the appointment");
}else if(insurance == false){
    System.out.println("Okay we can discuss payment after the appointment");
}

    }
}

