package library;

import java.util.Set;

public class StringUtility {

    //Returns the frequency of giving char from the given string, as int
    public static int frequency(String str, char ch){
        int count = 0;

        for(char each  : str.toCharArray() ){    //each: [a, a, a, b, c]
            if(each == ch){
                count++;
            }
        }
        return count;
    }

    //Returns the unique characters from giving string
    public static String unique(String str){
        String unique = ""; // "eg"
        for(int i=0; i <= str.length()-1; i++) {
            char each = str.charAt(i); // each character of the string
            int count = frequency(str,  each);  // finding teh frequency of every single char from str

            if( count == 1){
                unique += each;
            }
        }
        return unique;
    }

   // Revers the given string object and returns it
    public static String reverse(String str){
        String result = "";

        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }

        return result;
    }

    //Removes the duplicates from the string and returns it
    public static String removeDuplicates(String str){
        String result = "";  //"abc"

        for( int i = 0; i <= str.length()-1; i++  ){
            if(!result.contains( ""+str.charAt(i) )){
                result += str.charAt(i);
            }
        }

        return result;
    }

    //Returns the frequency of characters
    public static String frequencyOfCharacters (String str){
        String result = ""; //a3b4c2

        String nonDup = StringUtility.removeDuplicates(str);//a b c

        for (int i = 0; i <= nonDup.length() - 1; i++) {
            char ch = nonDup.charAt(i);//a
            int count = StringUtility.frequency(str, ch);  //3 4 2
            result += "" + ch + count;
        }
        return result;
    }

    //verify if the string palindrome

    public static boolean isPalindrome(String str){

        return  reverse(str).equalsIgnoreCase(str);
    }

//Returns frequency of words
public static int frequencyOfWord(String sentence, String word){
    sentence = sentence.toLowerCase();
    word = word.toLowerCase();

    int frequency = 0;

    while(sentence.contains(word)){
        sentence = sentence.replaceFirst(word, "");
        frequency++;
    }

    return frequency;
}
}