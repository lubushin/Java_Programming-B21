package TestPractice;

public class evenN {
    public static void main(String[] args) {
        /*
        Write a program
        that will print out even numbers from 2 to 100 through the comma.
         */

        for(int i = 2; i<=100;i++){
            if(i % 2 ==0){
                System.out.print(i+", ");
            }
        }

    }
}
