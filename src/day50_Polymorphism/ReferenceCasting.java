package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;
import day42_Inheritance.AnimalTask.Dog;
import day47_Abstraction.Shape.Circle;
import day47_Abstraction.Shape.Shape;
import day49_Abstarction.RemoteDriverTask.ChromeDriver;
import day49_Abstarction.RemoteDriverTask.WebDriver;

public class ReferenceCasting {

    public static void main(String[] args) {
        //implicit casting:Smaller type to Larger - done automatically
        int a=10;
        double b = a;

        //explicit casting:Larger type to Smaller - MUST be DOne manually
        double d = 10.5;
        int c = (int)d;

        System.out.println("========================================");
        Circle circle = new Circle(3);
        Shape shape = circle;// Upcasting references/classes: Smaller type to Larger;(implicit casting)
        WebDriver driver = new ChromeDriver();


        //down casting: casting Larger to Smaller
        Animal animal = new Dog("Lucy", "Husky",'M',12,"white","small");
        //animal.bark();
        Dog dog = (Dog) animal;
        dog.bark();

        Animal animal2 = new Dog("Jack","Brred",'F',12,"white", "small");
        ((Cat)animal2).meow();



    }

}
