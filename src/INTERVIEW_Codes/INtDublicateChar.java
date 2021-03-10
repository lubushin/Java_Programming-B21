package INTERVIEW_Codes;

public class INtDublicateChar {
    public static void main(String[] args) {
        String str = "abcabd";
        String result = "";//'abab'

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;

                }
            }
                if (count > 1)
                // && !result.contains(""+ch) - prints only 'ab'
                {
                    result += ch;
                }
            }


        System.out.println(result);
    }
}