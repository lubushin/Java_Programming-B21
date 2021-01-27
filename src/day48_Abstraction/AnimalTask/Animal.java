package day48_Abstraction.AnimalTask;

public abstract class Animal {

    public String name, bread, size;
    public char gender;
    public int age;

    public Animal(String name, String bread, String size, char gender, int age) {
        this.name = name;
        this.bread = bread;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    public abstract void sleep();
    //public abstract void eat();
    //public abstract void drink();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    /*
        interface hunt:
        hunt()
    interface flyable
        hunt()
    interface swimable
        swim();
    Abstract Animal:
        sleep(), eat(), drink()
    Lion extends Animal implements hunt
    Tiger extends Animal implements hunt
    Dog extends Animal
    Cat extends Animal
    Dolphin extends Animal impelents swimable
    Catfish extends Animal impelents swimable
    Shark extends Animal implements swimable, hunt
    Eagle extends Animal implements hunt, flyable
    Parrot extends Animal implements flyable

    Duck extends Animal implements swimable, flyable
     */

}
