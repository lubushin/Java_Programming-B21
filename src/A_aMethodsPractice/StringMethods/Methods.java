package A_aMethodsPractice.StringMethods;

public class Methods {
    public static void main(String[] args) {

        String str = "Lombard";
        String str1 = "Lomb";

        // charAt() : returns char value at the given index;
         char ch1 = str.charAt(str.length()-1);
        System.out.println(ch1);

        System.out.println("========================");
        //substring:
        String result = str.substring(0,4);//last index is not included
        System.out.println(result);
        System.out.println("==========================");

        int indOf = str.indexOf("d");
        System.out.println(indOf);

        System.out.println("========================");

        System.out.println(str.equals(str1));


    }

}
