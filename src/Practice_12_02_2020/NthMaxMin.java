package Practice_12_02_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthMaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,15));
        for(int i =1; i<5;i++){
        list.removeIf(p-> p== Collections.max(list) || p==Collections.min(list));
        }
        int fifthMax = Collections.max(list);
        int fifthMin = Collections.min(list);
        System.out.println("Fifth Max = " + fifthMax);
        System.out.println("Fifth Min = " + fifthMin);
        
    }
}
