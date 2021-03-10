package INTERVIEW_Codes;

import java.util.Scanner;

public class Inter_RemDub_Freq {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "aaabbc";//"a3b2c1"


    //Step 1: remove duplicates:

        String nonDup=""; //abc
        for(int i =0; i<str.length();i++){//i:0,1,2,.. represents each character
            String eachChar = ""+str.charAt(i);//a, a,a,b,b,c
            if(!(nonDup.contains(eachChar))){
               nonDup+=eachChar;
            }
        }

       String result = "";
        //Step 2: Frequency of each non duplicated characters
for(int j =0;j<nonDup.length();j++) {
    char ch = nonDup.charAt(j); //a
    int count = 0;//to contain the frequency of char char

    for (int i = 0; i < str.length(); i++) {
        char eachChar = str.charAt(i);// a,a,a,b,b,c
        if (ch == eachChar) {
            count++;
        }
    }
    result += "" + ch + count;
}
        System.out.println(result);

        /*
        1. write a program that can return the frequency of
        characters from a String
            Ex:
                str = "ababaac";
                output:
                    a3b2c1
         */
    }
}
