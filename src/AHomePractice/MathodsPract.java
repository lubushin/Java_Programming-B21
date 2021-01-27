package AHomePractice;

public class MathodsPract {
    public static void main(String[] args) {
        printOddNumFrom1To30();
        EvenNum();
        calculator(24.8, '/', 4);
        String str = reverseNum("1,2,3,4,5");
        System.out.println(str);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(max(arr));

        double[] arr1 = {23.4, 34.6, 29, 1};
        System.out.println(max(arr1));

    }

    public static void printOddNumFrom1To30() {
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void EvenNum() {
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int calculator(int a, int b) {
        return a + b;

    }


    public static void calculator(double n1, char operator, double n2) {

        System.out.println((operator == '+') ? "Addition: " + (n1 + n2) : (operator == '-') ? "Substraction: " + (n1 - n2)
                : (operator == '*') ? "Multiplication: " + (n1 * n2) : (operator == '/') ? "DIvision: " + (n1 / n2)
                : (operator == '%') ? "Reminder: " + (n1 % n2) : "Invalid number");

    }

    public static String reverseNum(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return result;
    }

    public static int max(int[] arr) {
        int max = 0;
        for (int each : arr)
            if (each > max) {
                max = each;
            }
        return max;
    }

    public static double max(double[] arr) {
        double max = 0;
        for (double each : arr) {
            if (each > max) {
                max = each;
            }

        }
        return max;
    }

}






