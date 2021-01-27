package day44_Inheritance.WebDriverTask;

public class CybertekDriver extends WebDriver{
    public CybertekDriver() {
        super("Cybertek Browser", "V75.0.1");


    }

    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL+" from Cybertek driver");
    }

    @Override
    public void close() {
        System.out.println("Closing from Cybertek driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximize from Cybertek driver");
    }


}
