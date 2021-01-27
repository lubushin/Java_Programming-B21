package day31_HP;

public class FrequencyOfWor {
    public static void main(String[] args) {

        
        String str = "We have day, day is beautiful, my day is good.";
        int count = frequencyOfWor(str,"day");
        System.out.println("count = " + count);
        
    }

    public static int frequencyOfWor(String str, String word){
        str.toLowerCase();
        word.toLowerCase();
        int frequency = 0;
        while(str.contains(word)){
            str = str.replaceFirst(word," ");
            frequency++;
        }
        return frequency;
    }
}
 /*
    1.  write a return method called frequencyOfWord that accepts two parameters: string str and String word, then returns the frequency of word
                Ex:
                    str = "Java java java python python"
                    word = "java";
                    frequency(str, word) ==>  3
     */
