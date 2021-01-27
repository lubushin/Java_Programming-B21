package day44_Inheritance.WebDriverTask;

public class Test {
    public static void main(String[] args) {

        //ChromeDriver driver = new ChromeDriver();
        //CybertekDriver driver = new CybertekDriver();
        FireFoxDriver driver = new FireFoxDriver();
        driver.get("Apple.com");

        driver.maximize();
        driver.close();

    }
}
