package INTERVIEW_Codes;

public class INtFrequensyOfCharacters {
    public static void main(String[] args) {
        String str = "abcababe";
        String result =""; //ce
for(int j = 0;j<str.length();j++) {
    char ch = str.charAt(j);
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        char eachChar = str.charAt(i);
        if (eachChar == ch) {
            count++;
        }
    }
    if (count == 1) {
        result += ch;
    }
}
        System.out.println(result);

/*for(int j =0;j<str.length();j++) {
    char ch = str.charAt(j);
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        char eachChar = str.charAt(i);
        if (eachChar == ch) {
            count++;
        }
    }
        if (count == 1) {
            result += ch;
        }
    }

        System.out.println(result);
*/
        /*
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

         */
    }
}
