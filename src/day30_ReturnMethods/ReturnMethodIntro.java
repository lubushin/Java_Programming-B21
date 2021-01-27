package day30_ReturnMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {
         addition(10,20);//void method

        System.out.println(addition2(10,20));//return method
       int sum = addition2(10,20);
       int multiplication = sum * 3;
        System.out.println(multiplication);
    }

    public static void addition(int n1, int n2){
        int n3 = n1 + n2;
        System.out.println(n3);
    }
public static int addition2(int n1, int n2){
        int n3 = n1 + n2;
        return n3;
}
}
