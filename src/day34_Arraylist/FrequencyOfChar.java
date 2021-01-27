package day34_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "AAABBCDDDDEEE";
        String result = "";//A3B2C1D4E3

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));// in order to use frequency method

       // for(String each : str.split(""))//we get every character from str add them into arraylist
         //   list.add(each);
        //System.out.println(list);
        for(String each : list){
            int frequency = Collections.frequency(list, each);
        if(!result.contains(each)) {
            result += each + frequency;
        }
        }
        System.out.println(result);

    }
}
