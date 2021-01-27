package day43_Inheritance.PersonTask;

public class Developer extends Employee{//Developer IS A Person. Develop IS A Employee
//inherited variables:name,age, gender,hourlyRate,jobTitle,ID
    //inherited methods:setInfo, setInfo(everload in Empl class), eat,sleep,work

    public Developer(String name, int age, char gender, double hourlyRate, String jobTitle,String ID){
    setInfo(name, age, gender, hourlyRate, jobTitle, ID);

    }
    public void coding(){
        System.out.println(jobTitle+" "+name+" "+" is coding");
    }

}
/*
   Developer extends Employee:
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), code()...
 */