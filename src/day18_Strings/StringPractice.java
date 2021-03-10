package day18_Strings;

public class StringPractice {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        System.out.println(s1 == s2);//true

        String s3 = new String("Cat");
        System.out.println(s1 == s3);//false
        System.out.println(s2 == s3);//false

        String s4 = new String("Cat");
        System.out.println(s3 == s4);//false

        //.eguals()-compare words(text)
        //== - compare location
        System.out.println(s1.equals(s3));//true
        System.out.println(s3.equals(s4));//true

        String s5 = new String("cat");
        System.out.println(s4.equals(s5));//false-case senzitive
        System.out.println(s4.equalsIgnoreCase(s5));// ignore Upper case
        System.out.println("=======================================");
  String str = "cybertek";
   str = str.toUpperCase();//Assign to Variable "str" = "CYBERTEK"
        System.out.println(str);
        str = str.toLowerCase();//Create New Object "cybertek"
        System.out.println(str);
        System.out.println("================================");
String name = "Lyubov Ubuhsin";
int n1 = name.length();
        System.out.println(n1);//14, but Last Index - 13(0,1,2...)
        String name2 = "Lyubov";
        int n2 = name2.length();
        System.out.println(n2);//6
        int lastIndex = name2.length()-1;
        System.out.println(lastIndex);//5
        System.out.println("=============================");
        String a = "Java Programming Language";
        char firstChar = a.charAt(0);
        char lastChar = a.charAt(a.length() - 1);
        System.out.println("First Character: " + firstChar);
        System.out.println("Last Character: " + lastChar);
        System.out.println("==================================");
        String b = "Today is Monday";
        char secondChar = b.charAt(1);
        char secondLastChar = b.charAt(b.length() - 4);
        System.out.println("secondChar = " + secondChar);
        System.out.println("secondLastChar = " + secondLastChar);
    }
}
