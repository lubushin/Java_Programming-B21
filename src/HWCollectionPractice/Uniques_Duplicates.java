package HWCollectionPractice;

import java.util.*;

public class Uniques_Duplicates {
    public static void main(String[] args) {
        String str = "aabcccdee";
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        for (String each : str.split("")) {
            int f = Collections.frequency(Arrays.asList(str.split("")),each);
                if(f>1){
                    map.put(each,f);
                }
                if(f==1){
                    map2.put(each,1);
                }
        }
        System.out.println(map);
        System.out.println(map2);
    }
}
