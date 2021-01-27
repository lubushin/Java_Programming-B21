package day31_MethodOverLoading;

import library.StringUtility;

public class FrequencyOfword {

    public static void main(String[] args) {
         String str = "Today is a great day, today we are learonhg java, today is a good day.";

         int count = frequencyOfWord(str, "today");

        System.out.println(count);

        String str2 = "jav, Java, JaVa, c#, C#, java, c#, java";
        int countJava = StringUtility.frequencyOfWord(str2, "java");
        int countCSharp = StringUtility.frequencyOfWord(str2, "c#");
        System.out.println("countCSharp = " + countCSharp);
        System.out.println("countJava = " + countJava);

        System.out.println("==============================================");

        String sentence = "dog,dog,dog,cat,dog,Cat,cay,cat";
        int countDog = StringUtility.frequencyOfWord(sentence,"dog");
        System.out.println("countDog = " + countDog);
        int countCat = StringUtility.frequencyOfWord(sentence,"cat");
        System.out.println("countCat = " + countCat);
    }


    /*
    1.  write a return method called frequencyOfWord that accepts two parameters: string str and String word, then returns the frequency of word
                Ex:
                    str = "Java java java python python"
                    word = "java";
                    frequency(str, word) ==>  3
     */
    public static int frequencyOfWord(String sentence, String word) {
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