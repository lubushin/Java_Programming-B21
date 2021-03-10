package HWCollectionPractice;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aaabbcc";

        Map<String,Integer> result = new LinkedHashMap<>();
        for (String eachChar : str.split("")) {
        int f = Collections.frequency(Arrays.asList(str.split("")),eachChar);
        result.put(eachChar,f);
        }

        System.out.println(result);
    }
}
