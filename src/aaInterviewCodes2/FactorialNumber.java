package aaInterviewCodes2;

public class FactorialNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
    public static int fact(int n){
        int result = 1;

        for(int i=1; i<=n;i++){
          result = result*i;
        }
        return result;
    }
}
