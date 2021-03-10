package day18_Strings;

public class StringMethod4 {
    public static void main(String[] args) {
        //isEmpty, equals, egualsIgnoreCase,contains,starsWith,endWith

        String str = "Hello Everyone";
        System.out.println(str.isEmpty());
        String str2 = "";
        System.out.println(str2.isEmpty());
        System.out.println("===================================");
        //contains
        String sentence = "i like to learn Java";
        System.out.println(sentence.contains("C#"));
        System.out.println(sentence.contains("Java"));
        System.out.println("==========================================");
        //startsWith; endsWith
        String webAddress = "www.amazon.com";
        boolean validAddress = webAddress.startsWith("www.")&& webAddress.endsWith(".com");
        System.out.println(validAddress);


    }
}
