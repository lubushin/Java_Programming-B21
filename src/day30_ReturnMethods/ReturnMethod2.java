package day30_ReturnMethods;

public class ReturnMethod2 {
    public static void main(String[] args) {
        String names = "racecar";
        reverseStr1(names);//void
        System.out.println("============================================");
        /* return:  String reversedNames =reverseStr2(names);
        boolean isPalindrome = names.equalsIgnoreCase(reversedNames);
        System.out.println(isPalindrome);*/
        System.out.println(reverseStr2(names));

    }
    //void method:
    public static void reverseStr1(String str){
    String result ="";
        for(int i = str.length()-1; i>=0;i--){
            result+=str.charAt(i);
        }
        System.out.println(result);
    }

//return method:

    public static String reverseStr2(String str){
        String result = "";
        for(int i = str.length()-1; i>=0;i--){
            result+=str.charAt(i);
        }
        return result;
    }

}
