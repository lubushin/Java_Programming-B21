package day45_Exceptions;



public class Throws_VS_TryCatch {
    public static void main(String[] args) {
        method1();
        System.out.println("Try & Catch");

        //method2();

        sleep(3);

        System.out.println("Test Completed");
    }

    public static void method1() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void method2() throws InterruptedException{//temporary solution
        Thread.sleep(1000);
    }

    public static void sleep(long seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
