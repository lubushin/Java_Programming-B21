package Office_Hours.Practicew_11_4_20;

public class SliceNumbers {
    public static void main(String[] args) {
        int number = 12345;
        //number devided by smallest number in 5(4,3,2) digit numbers;
        int digit1 = number / 10000;
        //12345 / 10000 = 1,2345 =>1
        int digit2 = number % 1000 /1000;
        //2345 / 1000 = 2,345=> 2-integer
        int digit3 = number % 10000 % 1000 / 100;

        int digit4 = number % 10000 % 1000 %100/10;
        //345%100/10
        //45/100
        //4
        int digit5 = number % 10000 % 1000 %100 % 10;
        //45%10
        //5
        System.out.println("Digit 1 = "+digit1);
        System.out.println("Digit 2 = "+digit2);
        System.out.println("Digit 3 = "+digit3);
        System.out.println("Digit 4 = "+digit4);
        System.out.println("Digit 5 = "+digit5);

        /*
        Display prompt: Enter your number:
12345
-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5

         */
    }
}
