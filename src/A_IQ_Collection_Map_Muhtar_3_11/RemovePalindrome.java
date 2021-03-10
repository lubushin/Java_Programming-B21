package A_IQ_Collection_Map_Muhtar_3_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindrome {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("Level", "Anna", "Nalan", "Java"));
        // for(Iterator<String> it = words.iterator();it.hasNext();){
        // if(isPalindrome(it.next()));}




   /* public static boolean isPalindrome(String str) {
        String reverse = "";
        for(int i = str.length() - 1, i>=0; i--){
            reverse += str.charAt(i);
            return reverse.equalsIgnoreCase(str);
        }
        //return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }*/

        List<String> words2 = new ArrayList<>(Arrays.asList("Level", "Anna", "Nalan", "Java"));
        Iterator<String> it = words2.iterator();
         String each = it.next();
         String reverse = "";
         for(int i =each.length()-1; i>=0;i--)
             reverse+=each.charAt(i);
         if(each.equalsIgnoreCase(reverse))
             it.remove();
        System.out.println(reverse);
    }


      /* public static boolean isPalindrome(String str) {
        String reverse = "";
        for(int i = str.length() - 1, i>=0; i--){
            reverse += str.charAt(i);
            return reverse.equalsIgnoreCase(str);
        }
        //return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }*/
}