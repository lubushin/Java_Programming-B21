package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;
import day42_Inheritance.AnimalTask.Dog;

import day43_Inheritance.carTask.BMW;
import day43_Inheritance.carTask.Car;
import day43_Inheritance.carTask.Toyota;
import day49_Abstarction.RemoteDriverTask.ChromeDriver;
import day49_Abstarction.RemoteDriverTask.JavaScriptExecuter;
import day49_Abstarction.RemoteDriverTask.TakeScreenShot;
import day49_Abstarction.RemoteDriverTask.WebDriver;
import day49_Abstarction.ShapeTasks.Circle;
import day49_Abstarction.ShapeTasks.Cube;
import day49_Abstarction.ShapeTasks.Cylinder;
import day49_Abstarction.ShapeTasks.Shape;

public class DownCAsting {
    public static void main(String[] args) {

        Shape shape = new Cylinder(3,5);
        //Cylinder cylinder = (Cylinder)shape;
        //System.out.println(cylinder.volume());

        double volume = ((Cylinder) shape).volume();
        System.out.println(volume);

        System.out.println("====================================");
        Animal animal = new Cat("Lena","Brred",'F',12,"white", "small");
        //((Dog)animal).bark();

        Car car = new Toyota("t","camry","white","China",2017,1000, 15000 );
        //car.race();

        System.out.println("================================");

        WebDriver driver = new ChromeDriver();
        ( (TakeScreenShot )driver).TakeScreenShort("pic");

        ((JavaScriptExecuter)driver).executeScript("");
        System.out.println("=========================================");

        Shape shape2 = new Circle(3);
        ((Cube)shape2).volume();
        System.out.println("===========================");
        ((TakeScreenShot) driver).TakeScreenShort("");
        ((JavaScriptExecuter) driver).executeScript("");

    }
}
