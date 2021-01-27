package aaInterviewCodes2;

public class DivisibleBy_3_5_15 {

    public static void main(String[] args) {
        divisible();
    }

    public static void divisible() {
        String divisibleBy15 = "";
        String divisibleBy3 = "";
        String divisibleBy5 = "";

        int[] arr = new int[100];
for(int i =0; i<arr.length;i++)
    arr[i] = i+1;
        for (int each : arr) {
            if (each % 3 == 0 && each % 5 == 0 && each % 15 == 0)
                divisibleBy15 += each + " ";

            if (each % 3 == 0 && each % 15 != 0)
                divisibleBy3 += each + " ";

            if (each % 5 == 0 && each%15 !=0)
                divisibleBy5 += each + " ";
        }
            System.out.println(divisibleBy15);
            System.out.println(divisibleBy5);
            System.out.println(divisibleBy3);


    /*    for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0)
                divisibleBy15 += i + " ";
       if(i%3==0 && !(i%5==0))
           divisibleBy3+=i+" ";

       if(i%5==0 && !(i%15==0))
       divisibleBy5+=i+" ";
        }

        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);
*/
        }
    }
