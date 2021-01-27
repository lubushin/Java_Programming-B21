package day49_Abstarction.RemoteDriverTask;

public class Testcases {

    public static void main(String[] args) {

    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.google.com");
    driver.TakeScreenShort("pic");
    driver.close();
        System.out.println("====================================================");

    FireFoxDriver driver2 = new FireFoxDriver();
    driver2.get("https://www.google.com");
    driver2.TakeScreenShort("pic");
    driver2.close();

        System.out.println("===============================================");



}
}
