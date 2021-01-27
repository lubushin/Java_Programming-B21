package day48_Abstraction.AnimalTask;

public final class Parrots extends Animal implements Flyable, Playable{
    public Parrots(String name, String bread, String size, char gender, int age) {
        super(name, bread, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Parrot sleeps for 9 hours");
    }

    @Override
    public void fly() {
        System.out.println("Parrot can fly 15 min");
    }

    @Override
    public void play() {
        System.out.println("Parrot can play with people");
    }
}
