package A_Edabit;

public class GetWordCount {
    public static void main(String[] args) {
        String s = "Many diamonds I have";
        System.out.println(countWords(s));
    }

    public static int countWords(String s) {

       /* String [] words = s.split("\\s+");
        return words.length;*/

        int countWords = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
                countWords++;
        }

    return countWords+1;

    }

}