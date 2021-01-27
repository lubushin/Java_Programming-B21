package aInterviewPractice;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        String a = "ABC";
        String b = "CDF";
        System.out.println(same(a,b));
    }
    public static boolean same(String a, String b){
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String res1 = "";
        String res2 = "";

        for(char each: ch1){
            res1+=each;}
        for(char each : ch2){
            res2+=each;}

        return res1.equals(res2);
    }


}




