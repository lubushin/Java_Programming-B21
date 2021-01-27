package library;

import day41_Encapsulation.Data;
import static day41_Encapsulation.Data.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(publicVariable);
       // System.out.println(privateVariable);NOT REach in dif Paccage
       //System.out.println(defaultVariable);

       // Data obj1 = new Data();- not Reachable-default modifier

     publicMethod();
     //privateMethod();
     //defaultMethod();



    }

}
