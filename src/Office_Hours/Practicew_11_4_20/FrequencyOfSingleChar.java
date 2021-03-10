package Office_Hours.Practicew_11_4_20;

import java.util.Scanner;

public class FrequencyOfSingleChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scan.next();
        System.out.println("Enter a character");
        char ch = scan.next().charAt(0);
        scan.close();
        //finding frequency:
        int frequency = 0;
        for(int i =0; i<str.length();i++){
            if(ch==str.charAt(i)){//if character match with the charac of string
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}
