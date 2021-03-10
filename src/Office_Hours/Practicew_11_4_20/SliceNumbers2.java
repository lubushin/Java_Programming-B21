package Office_Hours.Practicew_11_4_20;

public class SliceNumbers2 {
    public static void main(String[] args) {
        int number = 12345;

        String str = "" + number;//"12345"

        for (int i = 0, j = 1; i < str.length(); i++, j++) {
            System.out.println("digit " + j + " = " + str.charAt(i));
        }

    }
}
