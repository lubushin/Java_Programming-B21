package INTERVIEW_Codes;

public class INtRemoveUnqueCharacter {
    public static void main(String[] args) {
        String str = "abcabd";
        String result = "";//abab
        for (int j = 0; j < str.length(); j++) {//loop to run multiple times
            char ch = str.charAt(j);// to find each character
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char eacCharacter = str.charAt(i);
                if (str.charAt(i) == ch) {//will get each character one by one
                    count++;
                }
            }

            if (count > 1) {
                result += ch;
            /*if (count > 1){ count>1 && !result.contains(""+ch))
                result += ch;// result:ab
            }*/

        }
        }
        System.out.println(result);
    }
}