package day27_ForEachLoop;

public class UniqIntegInArr {
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,3,4};
        //          0 1 2 3 4 5
        for(int j=0; j<=arr.length-1;j++) {
            int element = arr[j];//j:1,1,2,3..represent each element
            int frequency = 0;//frequency of element
            for (int i = 0; i <= arr.length - 1; i++) {//i:0 1 2 3 4 5
                if (arr[i] == element) {
                    frequency++;
                }
            }//frequency of one element
            if (frequency == 1) {
                System.out.print(element+ " ");
            }
        }


        /*
      1.  write a program that can print out the unique numbers
        from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}
            output:
                2 4                                                          ==
    2. write a program that can find the unique strings from string array
                                            .equals
    3. write a program that can find the duplicated numbers from an integer array
    4. write a program that can find the duplicated strings from string array

         */
    }
}
