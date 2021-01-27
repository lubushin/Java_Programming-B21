package aInterviewPractice;

public class sumOfDigits {

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(SumDigits(str));
    }

    public static int SumDigits(String str){

        int total = 0;

       char[] ch = str.toCharArray();
       for(char each : ch){
         if(Character.isDigit(each)){
             total+=Integer.valueOf(""+each);

         }

       }

        return total;
    }
}
