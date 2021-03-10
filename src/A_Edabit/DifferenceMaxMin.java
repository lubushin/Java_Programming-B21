package A_Edabit;

public class DifferenceMaxMin {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,60};
        System.out.println(differenceMaxMin(arr));
    }

    public static int differenceMaxMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int each : arr){
            if(min>each) min=each;
            if(max<each) max=each;
        }


        /*int min = arr[0];
        int max= arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min)
                min=arr[i];

        }*/
        return max-min;
    }
}
