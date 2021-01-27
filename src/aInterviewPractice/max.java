package aInterviewPractice;

public class max {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        System.out.println(max(a));
        System.out.println(minV(a));
    }

    public static int max(int[] a) {
        int max = Integer.MIN_VALUE;

        for (int each : a) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
        public static int minV(int[]b) {
            int min = Integer.MAX_VALUE;
            for (int each : b) {
                if (each < min) {
                    min = each;

                }
            }
            return min;
    }
}