package day41_Encapsulation;

public class Test {
    public static void main(String[] args) {
        System.out.println(Data.publicVariable);
       // System.out.println(Data.privateVariable); can not call, PRIVATE
        System.out.println(Data.defaultVariable);

       // Data obj = new Data();

        Data.publicMethod();
        //Data.privateMethod();
        Data.defaultMethod();
    }
}
