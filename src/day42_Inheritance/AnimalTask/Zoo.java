package day42_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Jack","yorki",'F',4,"gold","small");

        System.out.println(dog);
        dog.eat("chicken");
        dog.drink("water");
        dog.sleep();
        dog.bark();

        System.out.println("===========================================");
        Cat cat = new Cat("Juli", "cat", 'F',6,"brown","medium");
        System.out.println(cat);
        cat.eat("tuna");
        cat.eat("milk");
        cat.sleep();
        cat.meow();
    }
}
