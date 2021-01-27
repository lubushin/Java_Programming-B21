package Practice_11_26_2020;

public class LoopsPractice {
    public static void main(String[] args) {
        for(int i =1; i<=50;i++){
            System.out.print(i+" ");
        }

        //Even Numbers
        System.out.println();
        for(int i =2; i<=50; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();

        // Odd numbers
        for(int i =1; i<=49; i+=2){
            System.out.print("Odd numbers: "+i+" ");
        }
        System.out.println();

        System.out.println("====================================");
        for(int i = 1; i<=50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

            for(int i = 1; i<=50; i++){
                if(i%2 != 0){
                  continue;
                }
                System.out.print(i+" ");
        }

        System.out.println();

for(int i =0; i<=50;i++){
    if(i%2==0){
        continue;
    }

    System.out.print(i+" ");
if(i==29){
    break;
}
}

    }
}
