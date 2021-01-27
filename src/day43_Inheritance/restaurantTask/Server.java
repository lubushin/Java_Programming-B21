package day43_Inheritance.restaurantTask;

import day43_Inheritance.PersonTask.Employee;

public class Server extends Employee {
    //inherited variables:name,age, gender,hourlyRate,jobTitle,ID
    //inherited methods: setInfo,setInfo(overloaded)eat,sleep,work,calcSalary
public Server(String name, int age, char gender, double hourlyRate, String jobTitle,String ID){
    setInfo(name, age, gender, hourlyRate, jobTitle, ID);
}

public void takeOrder(){
    System.out.println(jobTitle+" "+ name+ " is taking orders");
}
public void cleanTable(){
    System.out.println(jobTitle+" "+ name+ " is cleaning tables");
}

}
