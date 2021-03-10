package day53_Collection;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import library.ArraysUtility;

import java.util.*;

public class FrequencyOfCharactes {
    public static class frequency {
        public static void main(String[] args) {
               /*
            dddaaaaccbb
            dacb
            output: d3a4
             */

            String str = "aaabbcc";
            String result = "";
            for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {//a,b,c
                int f = Collections.frequency(Arrays.asList(str.split("")), each);
                //return frequency of string

                result += each + f;
            }
            System.out.println(result);

            System.out.println("===========================================");
            //List to Set
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
            Set<Integer> set = new LinkedHashSet<>(list);
            System.out.println(set);
            //SET TO LIST
            Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4));
            List<Integer> list2 = new ArrayList<>(set2);
            System.out.println(list2.get(3));

            System.out.println("++++++++++++++++++++");
            String num = "dddaaaaccbb";
            String rest = "";
for(String each : new LinkedHashSet<>(Arrays.asList(num.split("")))){
    int f = Collections.frequency(Arrays.asList(num.split("")),each);
    rest+=each + f;

}
            System.out.println(rest);
            }

        }
    }


              /*
            dddaaaaccbb
            dacb
            output: d3a4
             */