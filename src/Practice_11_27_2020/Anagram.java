package Practice_11_27_2020;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        /*
        Str1 = listen;
        str2 = Silent;
         */

        String str1 = "abcd";
        String str2 = "cdbl";

        str1 = str1.toUpperCase();//LISTEN
        str2 = str2.toUpperCase();//SILENT

        str1 = sort(str1);
       str2 = sort(str2);

        System.out.println(str1.equals(str2));

        System.out.println("=========================================");

String s1 = "accd";
String s2 = "acdc";

s1 = s1.toLowerCase();
s2 = s2.toLowerCase();
String[] arr1 = s1.split(" ");//[l,i,s,t,e,n}
String[] arr2 = s2.split(" ");

Arrays.sort(arr1);
Arrays.sort(arr2);//both in same order

boolean isAnagram = Arrays.equals(arr1,arr2);
        System.out.println(isAnagram);


        System.out.println("============================================");

    }
    public static String sort(String str){//[d,c,b,a]
     String result = "";
    char[] ch =  str.toCharArray();
    Arrays.sort(ch);//[a,b,c,d]
        for(char each: ch) result+=each;
        return result;

    }

}
