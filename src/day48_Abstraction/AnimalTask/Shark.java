package day48_Abstraction.AnimalTask;

public final class Shark extends Animal implements Predator, Swim{
    public Shark(String name, String bread, String size, char gender, int age) {
        super(name, bread, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Shark sleeps 4 hours");
    }

    @Override
    public void hunt() {
        System.out.println("Shark hunts fish");
    }

    @Override
    public void swim() {
        System.out.println("Shark can swim 20 hours");
    }
}
