package aaInterviewCodes2;

public class FibonacciNumbers {

    public static void main(String[] args) {
        int num = 8;
        fibNum(num);

    }
public static void fibNum(int num){
        int sumOfPrevTwo = 0;
        int num1 =0;
        int num2 = 1;

        for(int i =1; i<num; i++){
           sumOfPrevTwo= num1+num2;
            num1=num2;
            num2 = sumOfPrevTwo;
        }
    System.out.println(sumOfPrevTwo);
}
}
