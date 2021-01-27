package day43_Inheritance.PersonTask;

public class Person {
    public String name;
    public int age;
    public char gender;

    public void setInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
 Person
        name, age, gender
        setInfo, eat(), sleep()

Inheritance: to build IS A relationship between the classes. parent and child classes
             easiest and fastest way to get rich ==> extends
            child class (sub):  can inherit methods and variables from parent class (ONLY the visible variables and methods)
                    Constructor cannot be inherited
                    public: inheritable at every where
                    default: inheritable within same package
            Parent class (super): Cannot Inherit from sub class
 */