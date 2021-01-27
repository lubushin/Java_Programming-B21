package Practice_12_02_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxSecondMin {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,4,5,6,7,8,9,10,10,10));
        list.removeAll(Arrays.asList(Collections.max(list), Collections.min(list)));
        //remove all maximum numbers
        int secondMax = Collections.max(list);
        int secondMin = Collections.min(list);
        System.out.println(secondMax);
        System.out.println(secondMin);

    }
}
/*
Summary: to find the second max or min numbers:
1. Remove all max or min numbers;
2. Find the max or min numbeers
 */