package day20_ForLoop;

public class StringReverseInterviewQ {
    public static void main(String[] args) {
/*String str = "LYUBOV";
String result = "";
for(int i = str.length()-1; i>=0; i--) {
    result += str.charAt(i);
}
        System.out.println("result = " + result);

        //String result = "";  // we want to contain the expected result
        // which is the reversed version of str
        //DCBA

        //               3
        //for (int i = str.length() - 1; i >= 0; i--) { // i: 3, 2, 1, 0, -1
        //    result += str.charAt(i); // D C B A
        }


        //System.out.println("result = " + result);

    */

        String name = "Racecar";
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
        reverse+= name.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("=======================");
        if(reverse.equalsIgnoreCase(name)){
            System.out.println(name + ": is palindrome");
        }else{
            System.out.println(name + ": is not palindrome");
        }

    }



}


