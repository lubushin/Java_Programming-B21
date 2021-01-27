package aInterviewPractice;

import javax.xml.stream.events.Characters;

public class FreguencyOfCharacters {
    /*String -- Frequency of Characters
    Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
    public static void main(String[] args) {

        System.out.println(frequencyOfChars("AAABBCDDD"));
    }

    public static String frequencyOfChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {//represents a character that we are holding on
            String unique = "" + str.charAt(i);//i-index
            int count = 0;//will allow us to keep the frequency of the characters we are holding
            // also the count will reset every time the i-loop iterate
            for (int j = 0; j < str.length(); j++) {//allows us to compare our character that we
                // are holding on  with each character of the string(and check it)

                String eachChar = "" + str.charAt(j);//assigning string to each character
                // that we are going to compare

                if (unique.equals(eachChar)) {//we are comparing characters and using .equals() method
                    count++;//if conditions is true the count will go up by 1
                }
            }
            if (!result.contains(unique)) {//if our result doesn't already contain the character
                // that we are holding then we want to concatenate

                result += unique + count;
                // when the j-loop is done, we want to concatenate the count with
                // it'S corresponding character to the result
            }
        }
        return result;//return our string result

    }
}
