package TestPractice;

import java.sql.SQLOutput;

public class Uni {
    public static void main(String[] args) {
   int[] arr = {1,2,3,4,3,2,1,6,8,6,9};
   for(int each1 : arr) {
       int count = 0;
       for (int each : arr) {
           if (each == each1){
               count++;
           }
       }
       if(count ==1) {
           System.out.print(each1 + " ");
       }
   }

    }
}
