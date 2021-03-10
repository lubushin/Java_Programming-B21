package day27_ForEachLoop;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        /*String[] names = {"Delaram", "Aysel", "Snoop","Ayse", "Erjon"};
for(String eachName : names) {
String reversedName = "";
 for(int i = eachName.length()-1; i>=0;i--){
     reversedName += eachName.charAt(i);
 }
    System.out.print(reversedName+", ");
}
*/
Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
  String sentence = input.nextLine();
    String reversed = "";
    String [] words=sentence.split(" ");
     for(int i=words.length-1; i>=0; i--){
       reversed+= words[i]+" ";

    }
    reversed=reversed.trim();
    System.out.println(reversed);


    }
}
