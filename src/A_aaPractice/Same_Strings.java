package A_aaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Same_Strings {
    public static void main(String[] args) {

        String a ="acb", b="cba";       //strings with same char in random order
        String a1 = "abc", b1= "bcd";   //strings with not same characters
        String a2 ="abc", b2 = "abC";   // strings with same letters and String b has a Capital letter
        String a3 = "-12-3", b3="2-3-1";    //string with same num
        String a4 = "a b", b4 = "ba ";  //strings with space
        String a5 ="@#$", b5="#$@";     // strings contains special char in random order
        String a6="", b6="";            //empty strings

        System.out.println(isSame(a3,b3));
    }
    public static boolean isSame(String a, String b){
    char[] ch1 = a.toCharArray();
    char[] ch2 = b.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);

    String a1="", b1="";
for(char each : ch1){
    a1+=each;
}
        for(char each : ch2){
            b1+=each;
        }

    return a1.equals(b1);
    }

    }



