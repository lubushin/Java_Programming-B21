package day30_HP;

public class logic1CB {
    public static void main(String[] args) {
    }
    public boolean lastDigit(int a,int b, int c){

      if(a%10 ==b%10 && b%10==c%10){
          return true;
      }else{
          return false;
      }
    }
}
