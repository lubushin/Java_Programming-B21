package day17_Strings;
import java.util.Scanner;
public class String_Homework {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = input.next();
        char firstChar = 'A';
        char lastChar = 's';
        System.out.println(firstChar);
        System.out.println(lastChar);
        System.out.println(sentence);


    }

    /*
    1. write a program that ask user to enter sentence.
        then print out the first and last characters
    2. write a program to ask user to enter first name and last name
            then print the full name in all upper case
    3. write a program to ask use to enter first name and last name
            then print the initials (first letter of first name + first letter of last name)
    4. write a program that asks user to enter two string
            then print the longest string
    5. ask the user to enter two words. then add them together and print
            ex:
                input:
                    one
                    eight
                output:
                    oneeight
                    DO NOT use + operator
    6. write a program to ask the user their age. Add 5 to their age and print: In 5 years you will be $newAge years old
     */
}
