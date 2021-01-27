package day50_Polymorphism;

import day49_Abstarction.RemoteDriverTask.ChromeDriver;
import day49_Abstarction.RemoteDriverTask.CybertecDriver;
import day49_Abstarction.RemoteDriverTask.FireFoxDriver;
import day49_Abstarction.RemoteDriverTask.WebDriver;
import day49_Abstarction.ShapeTasks.Circle;
import day49_Abstarction.ShapeTasks.Rectangle;
import day49_Abstarction.ShapeTasks.Shape;
import day50_Polymorphism.PhoneTasks.IPhone;
import day50_Polymorphism.PhoneTasks.Phone;
import day50_Polymorphism.PhoneTasks.Samsung;

import java.util.ArrayList;

public class PolymorphismIntro {
    public static void main(String[] args) {
       IPhone iphone1 =  new IPhone("Iphone 12", "Red", 1000);
        Samsung samsung1 = new Samsung("Galaxy S20", "Black",900);

        Phone phone1 = new Samsung("Galaxy S21", "Black",900);
        Phone phone2 = new IPhone("Iphone 12", "Red", 1000);

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new IPhone("Iphone 12", "Red", 1000));
        phones.add(new Samsung("Galaxy S21", "Black",900));

        System.out.println("=====================================================");

       Shape shape;
       shape = new Circle(3);
        //shape = new Rectangle(3,4);
        System.out.println(shape.area());

   System.out.println("============================");
        String browserName = "chrome";

        WebDriver driver;

        switch(browserName){
            case "firefox":
                driver = new FireFoxDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "cybertek":
                driver = new CybertecDriver();
                break;

            default:
                throw new RuntimeException("Invalid Browser Name");


        }


    }
}
