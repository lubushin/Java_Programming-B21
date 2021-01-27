package Practice_11_27_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4};//[1,2,3,4]

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }
        System.out.println(list);

        int[] nonDup = new int[list.size()];//contains nonDup
        for (int i = 0; i <= nonDup.length - 1; i++) {
            nonDup[i] = list.get(i);
        }
        System.out.println(Arrays.toString(nonDup));
    }



    }

