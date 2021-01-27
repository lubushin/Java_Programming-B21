package day48_Abstraction.AnimalTask;

public final class Dog extends Animal implements Playable, Swim{

    public Dog(String name, String bread, String size, char gender, int age) {
        super(name, bread, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps for 5 hours");
    }

    @Override
    public void play() {
        System.out.println("Dog can play with people");
    }

    @Override
    public void swim() {
        System.out.println("Dog can swim for 1 hour");
    }
}
