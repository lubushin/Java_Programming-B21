package aaInterviewCodes2;

public class PrimeNumber {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(isPrime(n));
    }

   public static boolean isPrime(int n){
       if(n<2) return false;

       for(int i =2; i <n; i++){
           if(n % i ==0){
               return false;
           }
       }
       return true;
   }

}







