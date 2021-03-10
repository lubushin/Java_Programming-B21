package day26_Arrays;

public class FrequencyEachChar2 {
    public static void main(String[] args) {
        String str = "aaabbcaaaagggkkk   kkkkk";
        str=str.replace(" ","");//remove or ignore space
        String expectedResult = "";//a3c2c1

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {//i represent the index str
                char eachChar = str.charAt(i);
                if (ch == eachChar) {
                    count++;
                }
            }
            if(!expectedResult.contains(""+ch)){
            expectedResult += "" + ch + count;
            }
    }
        System.out.println(expectedResult);

    }
}
