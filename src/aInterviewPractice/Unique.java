package aInterviewPractice;

import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        String str = "AABCCD";//BD
        System.out.println(unique(str));
    }

    public static String unique(String str) {
        //convert string into array or creating String array
        String arr[] = str.split("");
        String unique = "";

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(arr[i])) {
                    count++;
                }
            }
                if (count == 1) {
                    unique += arr[i];
                }
            }



        return unique;


       /* String[] arr = str.split("");
        String uniq = "";

        for (int i = 0; i < arr.length; i++) {

            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(arr[i]))
                    count++;
            }

            if(count==1){
                uniq+=arr[i];
            }
        }
        return uniq;*/
    }
}