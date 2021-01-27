package aaInterviewCodes2;

public class EvenOddNUm {
    public static void main(String[] args) {
       int n = 3;
       int n2 = 4;
        evenOddNum(n);
       evenOddNum(n2);

    }
        public static void evenOddNum(int num){
            System.out.println((num % 2 == 0) ? "Even" : "Odd");

        }
    }

