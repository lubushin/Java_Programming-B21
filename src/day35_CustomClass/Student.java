package day35_CustomClass;

import java.time.LocalTime;

public class Student {
    public String name;
    public int age;
    public char gender;
    public String ID;

    public void setInfo(String stName, int stAge, char stGender, String stID) {

        name = stName;
        age = stAge;
        gender = stGender;
        ID = stID;
    }

    public void getInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", ID: " + ID);

    }

    public void study(String subject) {
        System.out.println(name + " is studying: " + subject);
    }

    public void eat(String food){
        System.out.println(name+ " eats: "+ food);
    }

    public void sleep(int hours){
        System.out.println(name+" sleeps: "+hours+"per day");
    }


    /*   1. Student:
            Attributes:
                    name, age, gender, ID
            Actions:
                setInfo
                getInfo
                study
                sleep
                ...*/

}
