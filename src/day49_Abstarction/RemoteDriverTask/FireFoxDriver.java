package day49_Abstarction.RemoteDriverTask;

public class FireFoxDriver extends RemoteDriver{
    @Override
    public void executeScript(String script) {
        System.out.println("Script "+script+ " is executed on FireFox");
    }

    @Override
    public void TakeScreenShort(String name) {
        System.out.println("Take ScreenShort on fairfox");
    }

    @Override
    public void get(String URL) {
        System.out.println("Navigating to "+ URL+ " on Fairfox");
    }

    @Override
    public void close() {
        System.out.println("Closing firefox browser");
    }

    @Override
    public void quit() {
        System.out.println("Quitting firefox browser");

    }
}
