package aInterviewPractice;

public class Reverse {
    public static void main(String[] args) {

        String city = "TOMS RIVER";
        String reverse = "";
        for (int i = city.length() - 1; i >= 0; i--) {
            reverse+=city.charAt(i);
        }
        System.out.println(reverse);

    }
}