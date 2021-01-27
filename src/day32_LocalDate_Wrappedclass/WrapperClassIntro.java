package day32_LocalDate_Wrappedclass;

public class WrapperClassIntro {
    public static void main(String[] args) {
        byte b = 100;
        Byte b2 = b; //autoboxing

        System.out.println("======================================================");
        Character ch = 'A';
        char ch2 = ch;//unboxing
        int n = ch;//unboxing

        long score = 100;
        Long d2 = score;//unboxing
        Long d3 = d2;//none

        double d4 = score;//none


    }
}
