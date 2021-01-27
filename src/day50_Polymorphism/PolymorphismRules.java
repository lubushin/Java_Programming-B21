package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Dog;
import day47_Abstraction.CarTask.BMW;
import day47_Abstraction.CarTask.Car;
import day47_Abstraction.CarTask.Tesla;
import day47_Abstraction.EmployeeTask.Tester;
import day49_Abstarction.ShapeTasks.Cube;
import day49_Abstarction.ShapeTasks.Shape;

public class PolymorphismRules {

    public static void main(String[] args) {
       Dog dog = new Dog("A", "Husky",'M',12,"white","small");
  dog.bark();

  Animal animal =  new Dog("A", "Husky",'M',12,"white","small");
    animal.eat("Dog food");
    //animal.bark();

        Cube cube = new Cube(5);
        System.out.println(cube.area());
        System.out.println(cube.perimeter());
        System.out.println(cube.volume());

        Shape shape = new Cube(5);

        System.out.println(shape.area());
        System.out.println(shape.perimeter());
        //System.out.println(shape.volume());

        System.out.println("==================================");

        Car car = new Tesla("3","white",2016,75000);
        car.start();

        Car car2 = new BMW("X5","red",2017,55000);
        car2.start();
        System.out.println("=====================================");
        Animal animal2 = new Dog("A", "Husky",'M',12,"white","small");
       //animal2.bark();

    }
}
