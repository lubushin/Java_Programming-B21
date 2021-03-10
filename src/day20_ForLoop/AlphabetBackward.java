package day20_ForLoop;

public class AlphabetBackward {
    public static void main(String[] args) {
        //A~~Z: 65 - 90 (Askii table)
        for(int i =90; i >=65; i--){
            System.out.print((char)i+" ");
        }
        System.out.println();
        for(char i = 'Z'; i>='a'; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        //a~z:97-122(Ackii Table)
        for(int i =122;i>=98;i--){
            System.out.print((char)i+" ");
            System.out.println();}

            for(char i ='z'; i>='a';i--){
                System.out.print(i + " ");
            }


        }
    }

