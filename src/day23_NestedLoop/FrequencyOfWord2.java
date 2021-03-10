package day23_NestedLoop;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String sentence = "Java Java java java";
        String word = "java";
        word.toLowerCase();
        String temp = sentence.toLowerCase();
        int count = 0;
        while(temp.contains(word)){
            temp = temp.replaceFirst(word,"");
            count++;//count frequency one by one
        }
        System.out.println(count);
    }
}
