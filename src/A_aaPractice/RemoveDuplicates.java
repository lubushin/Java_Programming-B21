package A_aaPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str1 = "8 28933 97";
        String str = "ABBCDDEFFG";//ABCDEFG
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            if (!result.contains("" + str1.charAt(i)))
                result+=str1.charAt(i);
        }
        System.out.println(result);
    }
}

