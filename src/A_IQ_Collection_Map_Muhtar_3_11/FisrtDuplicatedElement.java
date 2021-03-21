package A_IQ_Collection_Map_Muhtar_3_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FisrtDuplicatedElement {
    public static void main(String[] args) {

        // 1. Find the first dupciated element from the List
        /*List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,1,3,4,3,4,5,5));//3

        int result=0;
        for(Integer each : list){
            int fr = Collections.frequency(list,each);
            if(fr > 1){
                result = each;
                break;
            }
            }
        System.out.println(result);*/

        System.out.println("=========================================");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,3,4,3,4,5,5));//3
        int result =0;
        for(Integer each : list){//1,2,3,4,3,4,3,4,5,5 - repeating inner loop
          int frequency = 0;
          for(Integer each2 : list){//1,2,3,4,3,4,3,4,5,5 - for finding frequency of one element
              if(each == each2){
                  frequency++;//storing every duplicated element
              }
          }
            if(frequency >1){
                result = each;
                break;
            }
        }
        System.out.println(result);

        System.out.println("---------------------");
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,1,2,3));
        int result1 =0;
      for(Integer each : list1) {
          int freq = 0;
          for (Integer each1 : list1) {
              if (each == each1) {
                  freq++;
              }

              }
          if (freq > 1) {
              result = each;
              break;
          }

      }

      List<Integer> list3 = new ArrayList<>(Arrays.asList(7,8,9,5,6,7,8,9));
      int res=0;
      for(Integer each3 : list3){
          int f = 0;
          for(Integer each4 : list3){
              if(each3==each4){
                 f++ ;
              }
          }
          if(f>1){
              res=each3;
              break;
          }
      }
        System.out.println(res);

        }
    }



   /* 1. Find the first duplciated element from the List
    2. Move all zeros to the end of List
    3. remove palindrome strings from a list of string
    4. How to Iterate Set?
            5. How to Iterate Map?
            6. How to Iterate List Of Map?
*/