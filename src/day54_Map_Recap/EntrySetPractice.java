package day54_Map_Recap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySetPractice {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("A",85);
        students.put("B",75);
        students.put("C",95);
        students.put("D",89);
        students.put("E",99);

        System.out.println("==========================");

        for (String eachKey : students.keySet()) {
            System.out.println(eachKey+ " : "+students.get(eachKey));
        }
        System.out.println("==========================");

        for (Integer  eachValue : students.values()) {
            System.out.println(eachValue);
        }
        System.out.println("=============================");
       for( Map.Entry<String, Integer> each:students.entrySet()){
           System.out.println(each.getKey()+" : "+each.getValue());
       }

      /*  for (Map.Entry<String, Integer> each: students.entrySet()) {//each: each pair of data
            String eachKey = each.getKey();
            Integer eachValue = each.getValue();

            System.out.println(eachKey+" : "+eachValue);

        }
*/
    }
}
