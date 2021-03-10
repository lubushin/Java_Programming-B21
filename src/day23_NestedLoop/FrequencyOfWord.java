package day23_NestedLoop;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java is a programming language, I like Java Java Java Java";
        //removed "Java" from the sentence 2 times
        String word ="Java";
        int count = 0;
        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            //used replaceFirst we need to remove one by one
            //using replace - will replace in one time
            count++;
        }
        System.out.println(count);
        System.out.println(sentence);//word "Java" removed
    }
}
