package day41_Encapsulation;

import java.time.LocalDate;

public class PersonObject {
    public static void main(String[] args) {

        Person p1 = new Person("Jimmy",19,'M', LocalDate.of(1996,11,28));

        System.out.println(p1.getName());
        p1.setName("Lyuba");
        p1.setAge(52);
        //p1.setGender('F');

        System.out.println(p1.getName());
        System.out.println(p1.getGender());
        System.out.println(p1.getAge());
    }


}
