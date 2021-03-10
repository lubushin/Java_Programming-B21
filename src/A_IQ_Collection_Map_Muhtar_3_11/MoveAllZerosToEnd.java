package A_IQ_Collection_Map_Muhtar_3_11;

import java.util.*;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {

    List<Integer> list = new ArrayList<>(Arrays.asList(0,0,0,0,3,0,2,0,1,0));//[3,2,1,0,0,0]

//How many 0 we have in list
        int totalNumOfZeros = Collections.frequency(list, 0);//7
        list.removeAll(Arrays.asList(0));//[3,2,1]-all 0 removed
        for (int i  = 0;  i< totalNumOfZeros; i++) {
            list.add(0);
        }
        System.out.println(list);

        System.out.println("==============================");
       /* // second way to do
       int originalSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize=list.size();
        int totalNumOfZeros1 = originalSize - newSize;
        for (int i  = 0;  i< totalNumOfZeros; i++) {
            list.add(0);
        }
        System.out.println(list); */

        System.out.println("================================");
        // using ARRAY ; size is fixed
        int[] array = {3,0,1,0,2,0};//{3,2,1,0,0,0}
        int[] newArray = new int [array.length];
        System.out.println(Arrays.toString(newArray));

        int count = 0;
        for(int each : array){
            if(each !=0){
             newArray[count++] = each;
            }
        }
        System.out.println(Arrays.toString(newArray));

        System.out.println("====================================");

        // -- using ITERATOR --

        List<Integer> list2 = new ArrayList<>(Arrays.asList(0,0,0,0,3,0,2,0,1,0));//[3,2,1,0,0,0]

        //How many 0 we have in list
        int totalNumOfZeros2 = Collections.frequency(list, 0);//7
        //list2.removeAll(Arrays.asList(0));//[3,2,1]-all 0 removed - CAN NOT USE
        Iterator<Integer> iterate = list2.listIterator();
        while(iterate.hasNext()){
            if(iterate.next() == 0){
                iterate.remove();
            }
        }
        for (int i  = 0;  i< totalNumOfZeros2; i++) {
            list2.add(0);
        }
        System.out.println(list2);
        }
    }

