package day28_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[] arr1 ={1,2};
        //           0 1
        int[] arr2 = {3,4,5,6,7};
        //            0 1 2 3 4
        int[] arr3 = {8,9,10,11,12,13};
        //            0 1  2   3  4  5

        int[][] arrays = {arr1, arr2,arr3};
        //                 0     1    2

        System.out.println(arrays[2][0]);//retrieve theelement 8
        System.out.println(arrays[1][3]);//retrieve the element 6
        System.out.println(Arrays.toString(arrays[1]));//retrieve{3,4,5,6,7}-singlr dimen array
        System.out.println(Arrays.deepToString(arrays));//print entire array

        System.out.println("======================================");
        //print all arrays on separate line
        String[][] batch21 = {{"Ana", "Lily", "Igor"},
                {"Polina", "Serhii", "Abdujilil", "Aziz", "Halzat"
                },
                {"Justyna", "Adil", "Ercan", "Irina", "Med", "Olesea", "Vlad", "Asuman", "Guvanch"}
                     };
        for(int i =0; i<= batch21.length-1;i++){//i: index numbers of 1D arrays
            String[] eachGroup = batch21[i];
            System.out.println(Arrays.toString(eachGroup));

            //print each member of groups
            for(int j=0; j<= eachGroup.length-1;j++){//j:represent each element of each 1D arrays
                System.out.println(eachGroup[j]);
                System.out.println("========================================");


                }
            }

        }


    }

