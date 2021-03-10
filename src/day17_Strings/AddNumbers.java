package day17_Strings;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        /*
        5. ask the user to enter two words. then add them together and print
            ex:
                input:
                    one
                    eight
                output:
                    oneeight
                    DO NOT use + operator
         */
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first word");
        String firstW = inp.next();

        System.out.println("Enter second word");
        String secondW = inp.next();
        String concatBothWords = firstW.concat(secondW);
        System.out.println(concatBothWords);



    }
}
