package day26_Arrays;

public class FrequencyOfWords {
    public static void main(String[] args) {
        String sentence = "I love java, java is a cool programming language and java is more useful than javascript, python is a good language too";
        String[] arr = sentence.split(" ");
        int countJava = 0;
        int countPython = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            String eachWord = arr[i];
            if (eachWord.toLowerCase().contains("java")) {
                countJava++;
            }
            if (eachWord.toLowerCase().contains("python")) {
                countPython++;
            }

        }
        System.out.println("Count java: " + countJava);
        System.out.println("Count python: " + countPython);
    }
}
