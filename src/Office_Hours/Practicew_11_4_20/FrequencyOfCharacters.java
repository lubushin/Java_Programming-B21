package Office_Hours.Practicew_11_4_20;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "abbacaadddkkk";
        String result = "";//a4b2c1

        for(int j= 0; j<str.length();j++) {
            char ch = str.charAt(j);
            int count = 0;//for counting frequency
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            if(result.contains(""+ch)){//for skipping already existing char
                continue;
            }
            result += "" + ch + count; //"" MT space converting ch to string
        }
        System.out.println(result);
    }
}
