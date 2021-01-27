package INTERVIEW_Codes;

public class CommonElements {
    public static void main(String[] args) {
         /*
        write  aprogram that can print out the
        common elements from two integer Array
         */
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,4,5,6,7,8};
        for(int j = 0; j<=arr1.length-1;j++) {//iterates the arr1's index
            int element = arr1[j];//1
            for (int i = 0; i <= arr2.length - 1; i++) {//iterates the arr2 indexes
                if (element == arr2[i]) {
                    System.out.println(element);
                    break;
                }
            }
        }

        System.out.println("==============================");
//easier one for each loop
        for(int element : arr1) {
            for (int each : arr2) {
                if (each == element) {
                    System.out.println(element);
                    break;
                }
            }
        }

    }
}
