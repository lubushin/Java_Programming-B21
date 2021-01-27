package day44_Inheritance.WebDriverTask;

public class FireFoxDriver extends WebDriver{

    public FireFoxDriver(){
        super("FireFox Browser", "V83.0.0");
    }

    public void get(String URL) {
        System.out.println("Opening "+URL+" from FireFox driver");
    }

    public void close() {
        System.out.println("Closing FireFox driver");
    }

    public void maximize() {
        System.out.println("Maximizing FireFox driver");
    }
}
