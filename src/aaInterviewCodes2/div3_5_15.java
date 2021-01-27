package aaInterviewCodes2;

public class div3_5_15 {
    public static void main(String[] args) {
        div();
    }

    public static void div(){

        String divBy3 = "";
        String divBy5 = "";
        String divBy15 = "";

        int [] arr = new int[100];
        for(int i =0; i<arr.length; i++)
            arr[i] = i + 1;

            for (int each : arr) {
                if (each %3==0 && each%15!=0)
                divBy3+=each+" ";
              if(each % 5 ==0 && each%15 !=0)
                  divBy5+=each+" ";



            }
            System.out.println("divBy3: "+divBy3);
            System.out.println("divBy5: "+divBy5);
        }


    }

