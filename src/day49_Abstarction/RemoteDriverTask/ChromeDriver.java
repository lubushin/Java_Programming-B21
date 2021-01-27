package day49_Abstarction.RemoteDriverTask;

public class ChromeDriver extends RemoteDriver{

    @Override
    public void executeScript(String script) {
        System.out.println("Script "+script+ " is executed on Chrome");
    }

    @Override
    public void TakeScreenShort(String name) {
        System.out.println("Take Screenshort on Chrome");
    }

    @Override
    public void get(String URL) {
        System.out.println("Navigating to "+URL+" on chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing chrome browser");
    }

    @Override
    public void quit() {
        System.out.println("Quiting chrome browser");
    }
}
