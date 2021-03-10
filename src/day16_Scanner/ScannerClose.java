package day16_Scanner;
import java.util.Scanner;
public class ScannerClose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();//After closing we can not use again
        System.out.println(input.next());// will don't work
    }
}
