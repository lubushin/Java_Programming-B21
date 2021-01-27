package day48_Abstraction.AnimalTask;

public final class Lion extends Animal implements Predator{

    public Lion(String name, String bread, String size, char gender, int age) {
        super(name, bread, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps");
    }

    @Override
    public void hunt() {
        System.out.println("Lion hunts deer");
    }
}
