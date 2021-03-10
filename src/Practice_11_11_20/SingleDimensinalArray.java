package Practice_11_11_20;

import java.util.Arrays;

public class SingleDimensinalArray {
    public static void main(String[] args) {
        int [] scores = new int[5];

        scores[1] = 10;
        scores[2]=20;
        scores[0]=50;
        scores[3]=30;
        scores[4]=40;
       System.out.println(Arrays.toString(scores));
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores[4]);

        System.out.println("==================================");
        for(int i = 0; i<scores.length;i++) {
            System.out.println(scores[i]);
        }

        System.out.println("============================");

for(int each : scores){//each : element
    System.out.println(each);
}
        }

    }

