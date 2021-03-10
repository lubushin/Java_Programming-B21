import java.awt.*;
import java.util.*;
import java.util.List;

public class Practice28 {
    public static void main(String[] args) {
List<Integer> l1 = new LinkedList(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8));
//Set<Integer> set1 = new LinkedHashSet<>(l1);
l1.removeIf(p-> Collections.frequency(l1,p)>1);
        System.out.println(l1);

        System.out.println("===========================");
        List<String> list2 = new LinkedList<>(Arrays.asList("Anna", "Livio","Sobir", "racecar" ));
        Iterator<String> it = list2.iterator();
        while(it.hasNext()){
            String before = it.next();
            String after = "";
            for(int i = before.length()-1;i>=0;i--){
                after+=before.charAt(i);
            }
            if(before.equalsIgnoreCase(after)){
                it.remove();
            }
        }

        System.out.println(list2);

        System.out.println("=====================================");

String srs = "aabbccckkll";
Map<String, Integer> charOfFreq = new LinkedHashMap<>();
Set<String> characters = new LinkedHashSet<>(Arrays.asList(srs.split("")));
Iterator<String> it2 = characters.iterator();
while (it2.hasNext()){
    String each = it2.next();
    Integer frequency = Collections.frequency(Arrays.asList(srs.split("")),each);
   charOfFreq.put(each,frequency);
}
        System.out.println(charOfFreq);

        System.out.println("================================");

        System.out.println(charOfFreq.get("a"));
        System.out.println(charOfFreq.keySet());
        System.out.println(charOfFreq.values());
        charOfFreq.remove("b");
        System.out.println(charOfFreq);
        System.out.println(charOfFreq.entrySet());

        System.out.println("=====================================");

        String str = "Gaaaaalyyynna";
       for(int i =0; i<str.length(); i++){
        String result ="";

           System.out.print(result+=str.charAt(i)==str.charAt(i+1));
       }


    }

    }



