package day26_Arrays;
import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {

     //TO STRING method: Arrays.toString(); using only for printing ARRAY
      int[] numbers = {1,2,3,4,5,6};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        System.out.println(numbers);//hashcode - compiler can't read
        System.out.println(Arrays.toString(numbers));

        String [] classMates = {"Ken", "Sunat", "Peter", "Daniel", "Lena"};
        System.out.println(Arrays.toString(classMates));
        System.out.println("=====================================");
        //SORT(grouping) method
        int[] arr1 = {2000,3000,9000,456,876,9876};
      Arrays.sort(arr1);//does not return value, cannot assign to a variable or pass it in printing
        System.out.println(Arrays.toString(arr1));
        System.out.println("Max: "+arr1[arr1.length-1]);
        System.out.println("Min: "+arr1[0]);

        double[] arr2 = { 1.5, 0.5, 2.6, 0, 10.5, 78, 6, -0.75, -0.5 };
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));
        System.out.println("Second min number: " + arr2[1]);
        System.out.println("Second max number: "+arr2[arr2.length-1-1]);

        String[] names = {"Haroon", "Muhammed", "Ken", "Piter", "Dean", "Lyuba", "aigul","aijamal"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("======================+++===============");
        /*
        1. write a program that cna sort an array of integers in descending
                int[] arr = {5,1,2,6,7, 0};
                output:
                    7 6 5 2 1 0
                    output:
                        [7, 6, 5, 2, 1, 0]
         */
        int[] arr = {5,1,2,6,7, 0};
        System.out.println(Arrays.toString(arr));


                  for(int i = arr.length-1; i>=0; i--){
                       System.out.print( arr[i] + " ");
        }
        System.out.println("=========================================");

                  //EGUALS(arr1,arr2)
        int[] a1 = {1,2,3};
        int[] a2 = {1,3,2};
        Arrays.sort(a1);
        Arrays.sort(a2);
        boolean r1 = Arrays.equals(a1,a2);
        System.out.println(r1);
    }
}
