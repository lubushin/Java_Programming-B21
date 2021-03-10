package day28_MultiDimensionalArray;

public class TwoDementialArrays3 {
    public static void main(String[] args) {
        int [][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

        for(int i = arr2D.length-1;i>=0;i--){//i: index of arrays
            for( int each :arr2D[i] ){
                System.out.print(each+ " ");
            }
            System.out.println();
        }
        /*
            task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
         */

        System.out.println("=======================================");
      for(int[] each1DArray: arr2D){
          for(int i = each1DArray.length -1;i>=0;i--){
              System.out.print(each1DArray[i]+" ");
          }
          System.out.println();
      }
        /*
            task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9*/
        System.out.println("=========================================");
        /*
            task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1
         */
    }
}
