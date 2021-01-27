package aaInterviewCodes2;

public class Divide_Without_Operator {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 4;
        devides(num1,num2);
    }

    public static void devides(int num1, int num2){
        if(num2==0){
            System.out.println("Invalid Number");
        return;}

        int count = 0;
        while(num1>=num2){
            num1-=num2;
           count++;
        }

        System.out.println(count+ " and remainder is "+ num1);


    }
}















