package day49_Abstarction.RemoteDriverTask;

public interface WebDriver {
    void get(String URL);
    void close();
    void quit();
}
