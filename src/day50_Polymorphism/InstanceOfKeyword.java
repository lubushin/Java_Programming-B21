package day50_Polymorphism;

import day48_Abstraction.AnimalTask.Animal;
import day48_Abstraction.AnimalTask.Dog;
import day48_Abstraction.AnimalTask.Dolphin;
import day48_Abstraction.AnimalTask.Eagle;

public class InstanceOfKeyword {
    public static void main(String[] args) {
        Animal eagle = new Eagle("nn","b","s",'M',5);

        //boolean isDog = animal instanceof Dog;
        //boolean isDolphin = animal instanceof Dolphin;
        boolean isEagle = eagle instanceof Eagle;
        //boolean isAnimal = animal instanceof Animal;

        //System.out.println("isDog=" + isDog);
        //System.out.println("isDolphin= "+isDolphin);
        System.out.println("isEagle= "+isEagle);
        //System.out.println("isAnimal ="+isAnimal);

    }
}
