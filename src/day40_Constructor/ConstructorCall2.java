package day40_Constructor;

public class ConstructorCall2 {

    public ConstructorCall2(){
       //this(); //can not call itself
        //this(10); calling int
    }
    public ConstructorCall2(int a){
    this();
    }


}
