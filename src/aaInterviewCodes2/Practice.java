package aaInterviewCodes2;

public class Practice {
    public static void main(String[] args) {
        int n =5;
        fact(n);
    }

    public static void fact(int n){
  int result =1;
  for(int i =1; i<=n; i++){
      result = result*i;
  }
        System.out.println(result);
    }
}
