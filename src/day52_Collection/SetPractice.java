package day52_Collection;

import library.StringUtility;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> names1 = new HashSet<>();
        names1.addAll(Arrays.asList("Daniel","Ruslan" , "Adnan","Serhii" , "Ercan", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang"));
        System.out.println(names1);

        System.out.println("=================================================");

        Set<String> names2 = new LinkedHashSet<>();
        names2.addAll(Arrays.asList("Daniel","Ruslan" , "Adnan","Serhii" , "Ercan", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang"));
        System.out.println(names2);

        System.out.println("=============================================");
        Set<String> names3 = new TreeSet<>();
        names3.addAll(Arrays.asList("Daniel","Ruslan" , "Adnan","Serhii" , "Ercan", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang"));
        System.out.println(names3);

        System.out.println("====================================================");

        String str = "gggaaabbbccc";  // gabc
        String result = "";
        /*
        for (String s : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += s;
        }
         */

        //   String[] arr = str.split("");  // [g, g, g, a, a, a, b, b, b, c, c, c]

        LinkedHashSet<String> hs = new LinkedHashSet<>( Arrays.asList( str.split("") )  );  // [g, a, b, c]

        for (String each : hs) {
            result += each;
        }

        // System.out.println(hs.get(0));

        System.out.println(result);

        System.out.println("=======================================================");

        String str1 = "silent";
        String str2 = "listen";

        String s1 = new TreeSet<>(  Arrays.asList( str1.split("") ) ).toString()  ;
        String s2 =  new TreeSet<>(  Arrays.asList( str2.split("") ) ).toString()  ;

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.equals(s2));


        System.out.println("============================================================");

        // Null key:

        //System.out.println(str3);

        //     System.out.println( str3.toUpperCase() );

        HashSet<Integer> hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(hashSet);


        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(linkedHashSet);


        TreeSet<Integer> treeSet = new TreeSet<>();
        //   treeSet.addAll(Arrays.asList(null, null, null, null, null));
        // System.out.println(treeSet);

        //  String str4 = null;

        // System.out.println( str4.equals( "Muhtar" ));


        System.out.println("=============================================");

        Set<Integer>  numbers = new HashSet<>();
        numbers.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,5,5,5,5,5,5,5,5,5)  );

        int  maxNum = Collections.max(numbers);
        int min = Collections.min(numbers);

        //  Collections.sort(numbers);
        //  Collections.swap(numbers, 0 , 1);

        //  Collections.frequency(numbers,5);  //1

        System.out.println("maxNum = " + maxNum);
        System.out.println("min = " + min);


        System.out.println("======================================================");

        /*
        dddaaaaccbb
                    dacb
                    3422
        output:
            d3a4c2b2
         */








       //Collections.sort(numbers);//takes only list
        //Collections.swap(numbers,5); don't take
        System.out.println("=========================================");



 //String frequency = String.valueOf(Collections.frequency((letters)));

       //String unique = StringUtility.removeDuplicates(letters);
     /*   String nonDup = StringUtility.removeDuplicates(str);//a b c

        for (int i = 0; i <= nonDup.length() - 1; i++) {
            char ch = nonDup.charAt(i);//a
            int count = StringUtility.frequency(str, ch);  //3 4 2
            result += "" + ch + count;
        }
        return result;
    }

       } */
        System.out.println("+++++++++++++++++++++++++++++++");
        /*
        dddaaaaccbb
        dacb
        output: d3a4
         */
    //    Set<String> letters = new LinkedHashSet<>();
       // letters.addAll(Arrays.asList("dddaaaaccbb"));
        //System.out.println(letters);
   //String nonDup = StringUtility.removeDuplicates(letters);

        }

    }




