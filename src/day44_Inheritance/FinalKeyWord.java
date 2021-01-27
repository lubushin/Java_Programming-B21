package day44_Inheritance;

class Q {
    public final void method() {
        System.out.println("Method A");
    }

    public final void method(int a){
        System.out.println("Method A "+a);
    }
    }

public class FinalKeyWord extends Q {

   /* public void method(){
        System.out.println("Method B");
    }*/// Final methods can not be overriden

    public static int z=200;
    public final static void main(String[] args) {
        System.out.println(z);
        //z can not be re-assigned
    }
}
