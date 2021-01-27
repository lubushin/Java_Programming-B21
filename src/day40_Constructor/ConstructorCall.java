package day40_Constructor;

public class ConstructorCall {

    public ConstructorCall(){
        System.out.println("Default constructor");
    }
//only constructor class can call other constructor class

    public ConstructorCall(int a){
        this();//calling default constructor
        System.out.println("Constructor with int arg");
    }

    public ConstructorCall(String str){
        this(10);
        System.out.println("Constructor with String arg");
    }

    public static void main(String[] args) {
        ConstructorCall obj1 = new ConstructorCall("A");
    }




    public static void method1() {
        System.out.println("Method 1");
    }
    public static void method2() {
        method1();
        System.out.println("Method 2");
    }

    public static void method3() {
        method1();
        method2();
        System.out.println("Method 3");
    }

    //public static void main(String[] args) {
       // method3();
    }


