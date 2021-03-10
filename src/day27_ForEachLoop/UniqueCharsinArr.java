package day27_ForEachLoop;

import java.util.Arrays;

public class UniqueCharsinArr {
    public static void main(String[] args) {
        String str = "aabbcddeef";


        char[] arr = str.toCharArray();//[a, a, b, b, c, d, d, e, e, f]
        //String[] arr = str.split(""); created String Array
        System.out.println(Arrays.toString(arr));//created char Array
        for (int j = 0; j <= arr.length - 1; j++) {
            char element = arr[j];
            int frequensy = 0;
            for (int i = 0; i <= arr.length - 1; i++) {
                if (arr[i] == element) {
                    frequensy++;
                }
            }
            if (frequensy == 1) {
                System.out.print(element + " ");
            }
        }
    }

}
