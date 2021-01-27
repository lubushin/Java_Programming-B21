package day29_Methods;

public class MethodsWithoutParameters {
    public static void main(String[] args) {
        printHello5Times();
        System.out.println("Lyuba Ubushin");
        printHello5Times();
        System.out.println("Cybertek");
        printHello5Times();

        System.out.print("Odd numbers: ");
        MethodsWithoutParameters2.printOddNumbers1to100();
        System.out.print("Even Numbers: ");
        MethodsWithoutParameters2.printEvenNumbers1to100();

    }
    //independent/custom method Must be created in class NOT in method
    //Access Modifier  specifier  ReturnType  MethodName(Parameter)
      public            static     void        printHello5Times(){
        for(int i=1; i<6;i++){
            System.out.println("Hello");
        }
          }
/*
        step1: print hello 5 times  (for loop)
        step2: print your name
        step3: print hello 5 times  (for loop)
        step4: print your school name
        step5: print hello 5 times   (for loop)

 */

}
