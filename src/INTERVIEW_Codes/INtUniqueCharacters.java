package INTERVIEW_Codes;

public class INtUniqueCharacters {
    public static void main(String[] args) {
        String str = "abcababe";

        String result = "";//expected result
        for (int j = 0; j < str.length(); j++) {// j - represents the index num of str

            char ch = str.charAt(j);//each char in str
            int count = 0;//for the frequince of ch

            for (int i = 0; i < str.length(); i++) {//i-represent the index num of str
                char eachChar = str.charAt(i);//each character of the str
                if (eachChar == ch) {
                    count++;
                }
            }//count the frequency of ch

            if (count == 1) {//count if ch unique
                result += ch;
            }
        }
        System.out.println(result);

    }
}
