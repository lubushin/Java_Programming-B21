package day40_Constructor;

public class ConstructorIntro {

    public ConstructorIntro(int a){
        System.out.println("Constructor with int arg");
        int b;
        b=200;
        this.a = a;
        System.out.println("===============");
    }


    int a=100;
    public static void main(String[] args) {
        System.out.println("Hello");
        //System.out.println(a);
      int num = new ConstructorIntro(200).a;//a=200
      ConstructorIntro obj2 = new ConstructorIntro(300);//a=300
        ConstructorIntro obj3 = new ConstructorIntro(400);//a=400


    }
}
