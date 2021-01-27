package Practice_11_27_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {

        char[] ch1 = {'A', 'B', 'C', 'D','E'};
        char[] ch2 ={'A','B','H','I'};

        ArrayList<Character> list = new ArrayList<>();

        for(char each : ch1) list.add(each);
        for(char each : ch2) list.add(each);

        System.out.println(list);




    }
}
