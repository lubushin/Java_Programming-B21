package day44_Inheritance.WebDriverTask;

public class WebDriver {
    public String name, version;

    public WebDriver(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void get(String URL){
        System.out.println("Opening the default Web driver");
    }
    public void close(){
        System.out.println("Closing the WEB driver");
    }
    public void maximize (){
        System.out.println("maximizing the Web Driver");

    }


    public String toString() {
        return "WebDriver{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
