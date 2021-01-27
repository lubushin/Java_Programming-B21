package SashaMentor;

public class WrapperClass {
    public static void main(String[] args) {
//Difference between arrays and ArrayList
        int[] arr = new int[2];//1.Arrays type of creation
        arr[0] = 2;
        arr[1] = 3;
        int[] arr1 = {2,3,4};//2.assigned arrays values

        int[] arr2 = new int[]{2,3,4};//3.combine 1 and 2
        System.out.println("===================================");

        byte n1 = 4;
        Byte n2 = 4;
        java.util.ArrayList<Byte> list1  = new java.util.ArrayList<>();//value of list1 is null
        list1.add(n1);


    }
}
