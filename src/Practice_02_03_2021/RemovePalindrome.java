package Practice_02_03_2021;

import java.util.*;

public class RemovePalindrome {
    public static void main(String[] args) {
        //1. write a program that can remove the palindrome string from a list of String



        String[] words = {"Level","Anna", "Java","C#", "Nalan", "Python", "Racecar", "Java", "JAva"};
    // Set<String>list = new LinkedHashSet<>(Arrays.asList(words));
        List<String> list = new ArrayList<>(Arrays.asList(words));
        System.out.println(list);

        Iterator<String> it = list.listIterator();//iterated list of strings

        while(it.hasNext()){
            String eachObject = it.next();

            String reversed ="";//we declared, because we need compare with original after reversing
            for(int i = eachObject.length()-1;i>=0; i--){
                reversed+= eachObject.charAt(i);
            }
            if(eachObject.equalsIgnoreCase(reversed)){//if string/object in list palindrome
                it.remove();
            }
        }
        System.out.println(list);

        System.out.println("==========================================================");

        List<String> list2 = new ArrayList<>(Arrays.asList(words));
        System.out.println(list2);

        List<String> nonPalindrome = new ArrayList<>();
        for(String eachObject : list2) {
            String reversed = "";
            for (int i = eachObject.length() - 1; i >= 0; i--) {
                reversed += eachObject.charAt(i);
            }
            if(reversed.equalsIgnoreCase(eachObject)){
                continue;//skip this condition
            }
            nonPalindrome.add(eachObject);
        }
        System.out.println(nonPalindrome);
    }
}
