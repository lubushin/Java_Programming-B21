package A_IQ_Collection_Map_Muhtar_3_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REmoveDup_and_Fr {
    public static void main(String[] args) {

        String str = "asss dddd f ghhh jj k";




        str.split("");//every single character
       String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        String result ="";

        for (int i = 0; i < arr.length; i++) {
            String uniqueChar = arr[i];
           if(uniqueChar.equals(" ")){
               result+=uniqueChar;
               continue;
           }
            int f=0;
            for(int j=0; j< arr.length;j++){
               String eachChar = arr[j];
               if(uniqueChar.equals(eachChar)){
                   f++;
               }
            }
            if(!result.contains(uniqueChar))
            result+=uniqueChar + f;
        }

        System.out.println(result);
      /*  String result = "";
            for (int i = 0; i < str.length(); i++) {
                String unique = "" + str.charAt(i);
                if(unique.contains(" ")
                result+=unique;

                int freq = 0;
                for (int j = 0; j < str.length(); j++) {
                    String eachChar = "" + str.charAt(j);

                    if (unique.equals(eachChar)) {
                        freq++;
                    }
                }
                if (!result.contains(unique)) {

                    result += unique + freq;
                }
            }
        System.out.println(result);

    }



*/
    }
}



