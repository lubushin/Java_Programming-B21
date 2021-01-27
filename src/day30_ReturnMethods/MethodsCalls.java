package day30_ReturnMethods;
import library.ArraysUtility;
import library.StringUtility;

import java.util.Arrays;


public class MethodsCalls {
    public static void main(String[] args) {

        String str = "Level";
      String reversedName = StringUtility.reverse(str);
        System.out.println(str.equalsIgnoreCase(reversedName));
        System.out.println(reversedName);

        String str2 = "aaammmbbbcctbooppk";
        String result2 = StringUtility.removeDuplicates(str2);
        System.out.println(result2);
        String str3 = "aabcccdeee";
        String result3 = StringUtility.unique(str3);
        System.out.println(result3);
        System.out.println("======================================");
        int[] array = {1,2,0,-2,30,60,40,-20,-50};
        int[] descending = ArraysUtility.sort(array);
        System.out.println(Arrays.toString(descending));

        }
    }

