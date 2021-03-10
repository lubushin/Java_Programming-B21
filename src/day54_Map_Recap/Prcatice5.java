package day54_Map_Recap;

import java.util.*;

public class Prcatice5 {
    public static void main(String[] args) {
        String str = "aaabbbcccddd";
        List<String> strList = new ArrayList<>(Arrays.asList(str.split("")));
        Map<String, Integer> map1 = new TreeMap<>();

        for(Iterator<String> it = strList.iterator(); it.hasNext();){
            String each = it.next();
            Integer n = Collections.frequency(strList,each);
            map1.put(each, n);
        }

  System.out.println(map1);

    }
}
