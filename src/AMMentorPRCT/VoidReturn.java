package AMMentorPRCT;

import java.util.Arrays;

public class VoidReturn {
    public static void main(String[] args) {
      int[] scores = {1,2,3,4,5};
        reverse(scores);
    }
    public static void reverse(int[] scores){
     int[] reverseScores = new int[scores.length];
     int index = 0;
     for(int i = scores.length-1;i>=0;i--){
         reverseScores[index]=scores[i];
         index++;
     }
        System.out.println(Arrays.toString(reverseScores));
    }

}
