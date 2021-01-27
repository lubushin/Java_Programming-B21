package AHomePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySwap {

    public static void main(String[] args) {
int[] i = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(do_switch(i)));
    }
        public static int[] do_switch( int[] i) {

            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < i.length; j++) {
                list.add(i[j]);
            }

            Collections.swap(list, 0, list.size() - 1);

            for (int j = 0; j < list.size(); j++) {
                i[j] = list.get(j);
            }

            return i;


        }
}


