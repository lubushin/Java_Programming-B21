package day29_Methods;

public class ReverseString {
    public static void main(String[] args) {
        //"Cybertek" ==> "ketrebyC"

        reverse("Chernozemelsky");
        System.out.println("==============================");
        String[] names = {"Lyubov", "Lena", "Irina", "Inna", "Maryam"};

        for (String each : names)
            reverse(each);

    }

    public static void reverse(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        System.out.println(result);
    }
}


