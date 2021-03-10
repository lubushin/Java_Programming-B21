package day27_ForEachLoop;

import java.util.Arrays;

public class CombineThreeArrays {
    public static void main(String[] args) {
        String[] group1 = {"Sara", "Jesicca","Parker", "Dragisa", "Sladjan"};
        String[] group2 = {"Delaram", "Aysel", "Snoop","Parker", "Dragisa", "Sladjan","Delaram", "Aysel"};
        String[] group3 = {"Delaram", "Aysel", "Snoop","Ayse", "Erjon"};

        String [] groups = new String[group1.length+ group2.length+ group3.length];
        int i =0;
        for(String each: group1){
            groups[i++]=each;
        }
        for(String each: group2){
            groups[i++]=each;
        }
        for(String each: group3){
            groups[i++]=each;
        }

        System.out.print(Arrays.toString(groups));

    }
}
/*
       String[] group1  ==> 5 names
       String[] group2  ==> 10 names
       String[] group3  ==> 7 names
       String[] groups ==> 22 names

 */
