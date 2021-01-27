import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Birthday {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy EEEE");
        LocalDate dateOfBirth = LocalDate.of(1953,4,23);
        System.out.println("You were born on: "+dateOfBirth.format(df));
    }

   /* public static void main(String[] args) {
      LocalDate Dofb = LocalDate.of(1968,10,13);
        HappyBirthDay(1968, 10, 13);
    }

    public static void HappyBirthDay(int year, int month, int day){
        LocalDate birthday = LocalDate.of(year,month, day);
        LocalDate today = LocalDate.now();
        int month2 = today.getMonthValue();
        int day2 = today.getDayOfMonth();
        if(month2 == month && day == day2){
            System.out.println("Today is your birthday!!!");
            System.out.println("   \n \t \t  \t \t    * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("   \t \t  \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
            System.out.println("  \t \t  \t \t *  *                                       *  * ");
            System.out.println(" \t \t  \t \t*  *          Happy BirthDay To You!         *  * ");
            System.out.println("  \t \t  \t \t *  *                                       *  * ");
            System.out.println("  \t \t   \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
            System.out.println("   \t \t   \t \t    * * * * * * * * * * * * * * * * * * * * *");
            return;
        }
        System.out.println("Today is not your birthday");
    }
}
*/
}