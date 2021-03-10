package day17_Strings;

public class String_memory {
    public static void main(String[] args) {

        String strOne = "java";
        String strTwo = "java";
        String strThree = new String("java");
        String strFour = new String("java");
        System.out.println(strOne == strTwo);//true
        System.out.println(strOne == strThree);//false
        System.out.println(strThree == strFour);//false

        String strFive = "Java";// made in String pool
        System.out.println(strOne == strFive);//false

    }
}
