package day24_NeateedLoop;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "AABCCDEFFGGHJ";

        for(int index = 0;index< str.length(); index++){//index<=str.length()-1
          //purpose of the loop is to iterate through the character one at the time
        int frequency = 0;//resetting the value each iteration of the out loop(first loop)
        //charAt(index) --> A//index=0--> A
            // other --> AABCCD
            for(int inner = 0; inner<str.length();inner++){
                //charAt(inner)--> A A B C C D
                //0->A
                //1->A
                //2->B
                if(str.charAt(index)==str.charAt(inner)){
                    frequency++;
                  //compararing A==A-->freq = 1
                  // comp       A==A-->freq = 2
                  //            A==B-->freq = 1

                }
            }
            if(frequency==1){
                System.out.print(str.charAt(index));
            }

        }

        /*write a program that can find the unique characters
        from a string
            Ex:
                 str = "AABCCD";
                 output:
                        BD
            approach:
                    find the frequncy of each character one by one, and if the frequency of the character is equal to 1, it means it's unique
             In previous section we leaned how to find the frequency of one character. you will need to repeat the same steps
*/

    }
}
