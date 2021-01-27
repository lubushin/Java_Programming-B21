package day45_Exceptions;

public class Driver {
    public static void main(String[] args) {
        String browserName = "Chrome";

        switch(browserName.toLowerCase()){
            case "chrome":
                System.out.println("Chrome is selected");
                break;
            case "firefox":
                System.out.println("FireFox is selected");
                break;
            case "opera":
                System.out.println("Opera is selected");
                break;

            default:
                throw new RuntimeException("No such a Browser Named "+ browserName);
        }

        System.out.println("================================================");

        throw new ClassCastException("Invalid Class");

    }
}
