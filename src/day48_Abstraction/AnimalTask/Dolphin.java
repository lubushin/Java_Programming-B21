package day48_Abstraction.AnimalTask;

public final class Dolphin extends Animal implements Swim, Playable{
    public Dolphin(String name, String bread, String size, char gender, int age) {
        super(name, bread, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Dolphin sleeps 9 hours");
    }

    @Override
    public void play() {
        System.out.println("Dolphin can play with people");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin can swim 10 hours");
    }
}
