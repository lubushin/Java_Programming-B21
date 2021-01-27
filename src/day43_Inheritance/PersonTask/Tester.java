package day43_Inheritance.PersonTask;

public class Tester extends Employee {//Tester IS Person and Tester IS an Employee
//inherited variables:name,age, gender,hourlyRate,jobTitle,ID
    //inherited methods: setInfo,setInfo(overloaded)eat,sleep,work

    public Tester(String name, int age, char gender, double hourlyRate, String jobTitle,String ID){
    setInfo(name, age, gender, hourlyRate, jobTitle, ID);

    }
    public void testing(){
        System.out.println(jobTitle+" "+name+ " is testing");
    }
}
/*
 Tester extends Employee:
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), testing(),...

 */