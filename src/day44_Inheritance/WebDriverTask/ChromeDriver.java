package day44_Inheritance.WebDriverTask;

public class ChromeDriver extends WebDriver {
    public ChromeDriver() {
        super("Chrome Browser", "V84.0.1");
    }

    public void get(String URL) {
        System.out.println("Opening "+URL+" from the Chrome Driver");
    }

    public void close() {
    System.out.println("Closing the Chrome Driver");
    }

    public void maximize() {
    System.out.println("Maximizing the Chrome Driver");
    }
}
