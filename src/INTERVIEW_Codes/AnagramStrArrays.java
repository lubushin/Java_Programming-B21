package INTERVIEW_Codes;

import java.util.Arrays;

public class AnagramStrArrays {
    public static void main(String[] args) {
        //anagram task
        String s1 = "acb";//a,b,c
        String s2 = "acb";//b,a,c

        char[] ch1 =  s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean isAnagram = Arrays.equals(ch1,ch2);
        System.out.println(isAnagram);


    }
}
