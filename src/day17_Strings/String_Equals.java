package day17_Strings;

public class String_Equals {
    public static void main(String[] args) {

        String str = "jira";
        String str2 = new String("jira");

        System.out.println(str==str2);
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase("Jira"));
        /*System.out.println(str == str2);//false-compare location
        System.out.println(str.equals(str2));//true-compare value
        System.out.println(str.equals("jira"));

        System.out.println(str.equalsIgnoreCase("Jira"));*/

    }
}
