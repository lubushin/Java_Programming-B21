package TestPractice;

public class Stringta {
    public static void main(String[] args) {
        String ta = "A";
        ta = ta.concat("B");
        String tb = "C";
        ta = ta + tb;
        ta.replace('C','D');
        ta = ta+tb;
        System.out.println(ta);
    }
}
