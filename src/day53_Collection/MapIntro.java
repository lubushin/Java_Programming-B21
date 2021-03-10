package day53_Collection;

import java.util.*;

public class MapIntro {
    public static void main(String[] args) {
       //we store a pair of Object
        Map<String, String> credentials1 = new HashMap<>(); // random order, except "Null"

        Map<String, String> credentials2 = new LinkedHashMap<>();//keeps the insertion order,except "Null"

        Map<String, String> credentials3 = new TreeMap<>();//sorted,does not except "Null"

        Map<String, String> credentials4 = new Hashtable<>();
        //is synchronized,(runs slowly than HashMap) thread safe;shares all methods of HashMap




    }
}
