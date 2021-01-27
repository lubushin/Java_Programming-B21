package day45_Exceptions;

public class ExceptionIntro {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        //System.out.println(array[100]);//unexpected event=> unchecked=>run time

        //Thread.sleep(2000);//unwanted event=>checked=>compile error

        System.out.println(10 / 0);


        System.out.println("Test completed");
    }
}
