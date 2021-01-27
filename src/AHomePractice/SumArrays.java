package AHomePractice;

public class SumArrays {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] arr1 = {10,20,30,40};
        int sum=0;

        for(int each : arr){
            sum+=each;
        }
        for(int each : arr1){
            sum+=each;
        }
        System.out.println(sum);
    }
}
