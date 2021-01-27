package aInterviewPractice;

public class FrequencyOfharacters2 {
    public static void main(String[] args) {
        String str = "AAABBC";
        System.out.println(FreqOfChar(str));
    }
    public static String FreqOfChar(String str){
        String result = "";
for(int i = 0; i<str.length();i++){
    String unique = ""+str.charAt(i);
    int freq =0;
    for(int j = 0; j<str.length();j++) {
        String eachChar = "" + str.charAt(j);

        if (unique.equals(eachChar)) {
            freq++;
        }
    }
if(!result.contains(unique)){

result +=unique+freq;
}
    }

        return result;
    }
}
