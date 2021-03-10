package day26_Arrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "abcde";
       char[] array =str.toCharArray();
        System.out.println(Arrays.toString(array));

        System.out.println("=====================================");
       //INTERVIEW QUESTION
        //anagram task
        String s1 = "acb";//a,b,c
        String s2 = "def";//b,a,c

        char[] ch1 =  s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean isAnagram = Arrays.equals(ch1,ch2);
        System.out.println(isAnagram);
        System.out.println("=======================================");
// SPLIT method

        String sentence = "Today is a great day";
        sentence.split(" ");
        String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));


    }
}
