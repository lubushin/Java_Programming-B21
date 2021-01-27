package AMMentorPRCT;

public class VoidReturn2 {
    public static void main(String[] args) {

        int sum = minus(40,10);
        System.out.println(sum);

         minus(30,20);

    }
    public static void plus(int a, int b){
        System.out.println(a+b);
    }
    //return
    public static int minus(int a, int b){
        return a-b;
    }
}
