package INTERVIEW_Codes;
import java.util.Scanner;
public class MaxLengthInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the words");
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
        //write your code below
        int i = 0;
        for(String each:words){
            if(each.length()>words[i].length()){
                words[i] =each;
            }
        }

        System.out.println(words[i]);
    }

}


