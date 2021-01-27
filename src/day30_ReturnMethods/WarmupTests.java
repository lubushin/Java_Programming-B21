package day30_ReturnMethods;

import java.util.Arrays;

public class WarmupTests {
    public static void main(String[] args) {
        positiveNegativeZero(0);
        positiveNegativeZero(78);
        positiveNegativeZero(-23);
        System.out.println("====================================================");

        int[] numbers = {1, 2, 3, 4, -5, -6, -7, -8, 9, 10, 11, 0};
        for (int each : numbers) {
            positiveNegativeZero(each);
            System.out.println("=======================================");
            gradeCalculator(95);
            gradeCalculator(83);
            gradeCalculator(-89);
            System.out.println("======================================");
            int[] a1 = {10, 50, 60, 70};
            int[] a2 = {20, 90, 100};
            combineTwoArrays(a1, a2);
            System.out.println("=============================================");

            removeDuplicates("aaannnmmmccklllll");
            String str = "mmmkklllsssfffggg";
            removeDuplicates(str);
            System.out.println("====================================");
            formattedFullName("cYbErTeK", "SCHOOL");
        }

    }

    /*1. create a function that can check if the given integer
    is positive, negative or zero*/
        public static void positiveNegativeZero ( int number){
            String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
            System.out.println(number + " is " + result);
        }

        /* Task2. create a function that can calculate the grade of the student*/
        public static void gradeCalculator ( int score){
            if (score >= 0 && score <= 100) {
                if (score >= 0 && score <= 100) {
                    if (score >= 90) {
                        System.out.println("A");
                    } else if (score >= 80) {
                        System.out.println("B");
                    } else if (score >= 70) {
                        System.out.println("C");
                    } else if (score >= 60) {
                        System.out.println("D");
                    } else
                        System.out.println("F");
                }

                // System.out.println((score>=90)?'A':(score>=80)?'B':(score>=70)?'C'
                //     :(score>=60)?'D':'F');
            } else {
                System.out.println("Invalid Score");
            }

        }

    /*Task3. create a function that can print out the combination of
    two integer arrays                 {1,2}           {3,4,5}   */
        public static void combineTwoArrays ( int[] arr1, int[] arr2){
            int[] arr3 = new int[arr1.length + arr2.length];
            int i = 0;//represents the index nums of arr3

            for (int each : arr1) {//each element of arr1 is being assigned to th index of arr3
                arr3[i++] = each;
            }
            //i = 2;

            for (int each : arr2) {
                arr3[i++] = each;//each element of arr2 is being assigned to th index of arr3
            }
            Arrays.sort(arr3);
            System.out.println(Arrays.toString(arr3));

        }

    /*Task4. create a function that can print a string without
    the duplicated characters          "aabccb"    */
        public static void removeDuplicates (String str){
            String result = ""; //"abc"
            for (String each : str.split("")) {//[a,a,b,c,c,b]
                if (!result.contains(each)) {
                    result += each;
                }
            }
   /* for(int i =0; i<= str.length()-1;i++) {
        if (!result.contains("" + i)) {
            result += i;
        }
    }*/
            System.out.println(result);
        }


    /*Task5.  write a method that can print out the full name of a person in reugral format
            ex:
               fullName("cYbErTeK", "SCHOOL");
                output:
                    "Cybertek School"*/

    public static void formattedFullName(String first, String last){
            first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
            last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
            String fullName = first + " " + last;
            System.out.println(fullName);

        }
    }


