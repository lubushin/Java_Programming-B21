package A_IQ_Collection_Map_Muhtar_3_11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IteratingSet {
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6));
        /*for(int i =0; i< set.size(); i++){ CAN NOT USE FOR EACH LOOP
            System.out.println(set.get(i));}*/

        for (Integer each : set) {
            System.out.println(each);
        }
        System.out.println("==============================");
        Iterator<Integer> it = set.iterator();
        while(it.hasNext())
            System.out.println(it.next());


    }

}
