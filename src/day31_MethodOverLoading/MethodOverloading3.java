package day31_MethodOverLoading;

public class MethodOverloading3 {
    public static void main(String[] args) {
     double[] arr = {1.5, 3.4, 6.8, 1, 4, 6.7};
        System.out.println(max(arr));
        System.out.println(min(arr));

    }

    //Returns the maximum number from an array of integer
    public static int max(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static double max(double[] arr){
        double max = arr[0];
        for (double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }


    //Returns the minimum number from an array of integer
    public static int min(int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static double min(double[] arr){
        double min = arr[0];
        for (double each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }


}
