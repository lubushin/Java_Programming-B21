package day22_JavaRecap;

public class NestedLoopIntro {
    public static void main(String[] args) {


        /*for(int i = 1; i<=10; i++){
            System.out.print(i + "");
        }
        System.out.println();*/

        for(int j=1; j<=3;j++){
            for(int i = 1; i<=20; i++){
                System.out.print(i + "");
            }
            System.out.println();
            System.out.println("==================================");
            for(int n =1; n<=3;n++) {
                for (int i = 1; i <= 10; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }


        }

    }
}
