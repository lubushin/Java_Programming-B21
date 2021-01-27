package day30_HP;

public class formatedName {
    public static void main(String[] args) {
FormatedName("lyUboV", "tseReNoVA");
    }

    public static void FormatedName(String first, String last){
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = first + " " + last;
        System.out.println(fullName);
    }
}
