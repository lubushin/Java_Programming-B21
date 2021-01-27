package day30_HP;

public class PoNeZeroNumbers {
    public static void main(String[] args) {

        PositiveNegativeZeroNumbers(123);
        PositiveNegativeZeroNumbers(0);
        System.out.println("=================================");

        int[] numbers = {1, 2, 3, -5, -8, -9, 0};
        for (int each : numbers) {
            PositiveNegativeZeroNumbers(each);
            System.out.println("=================================");

            for (int i = 0; i <= numbers.length - 1; i++) {
                PositiveNegativeZeroNumbers(numbers[i]);
            }
            System.out.println("========================================");
            GradCalculator(75);

        }

    }

    public static void PositiveNegativeZeroNumbers(int numbers) {
        String results = (numbers > 0) ? "Positive" : (numbers < 0) ? "Negative"
                : "Zero";
        System.out.println(numbers + " is: " + results);
    }

    public static void GradCalculator(int score) {
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println(score + ": is A");
            } else if (score >= 80) {
                System.out.println(score + ": is B");
            } else if (score >= 70) {
                System.out.println(score + ": is C");
            } else if (score >= 60) {
                System.out.println(score + ": is D");
            } else if (score >= 50) {
                System.out.println(score + ": is F");
            } else {
                System.out.println("Invalid score");
            }
        }

    }
}