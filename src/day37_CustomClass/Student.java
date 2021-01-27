package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
  public String name,ID;
  public LocalDate DOfB;
  public int age;
  public char gender;
  public double gpa;
    public void setInfo(String name, String ID, LocalDate DOfB, int age, char gender, double gpa) {
        this.name = name;
        this.ID = ID;
        this.DOfB = DOfB;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;
    }

    public void setInfo(String name, char gender, LocalDate DOfB, String ID, double gpa){
      this.name = name;
      this.gender = gender;
      this.DOfB = DOfB;
      age = LocalDate.now().getYear() - DOfB.getYear();
      this.ID = ID;
      this.gpa = gpa;
  }

    public void getInfo(){
        System.out.println("Student name : " + name + "\nStudent ID   : " + ID + "\ngpa: " + gpa + "\nAge: " + age + "\nGender: " + gender);
    }

    public String toString(){
        return "Name: "+name+ ", Gender: "+gender+", DOB: "+DOfB+", ID: "+ID+", GPA: "+gpa;
    }

}
/*
1. Student:
            Attributes:
                    name, age, gender, ID
            Actions:
                setInfo
                getInfo
                study
 */


