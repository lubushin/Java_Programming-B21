package day35_CustomClass;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Employee {
    //instance variable - can store different data to different objects
    public String name;
    public char gender;
    public int SSN;
    public int ID;
    public String jobTitle;
    public String companyName;
    public double salary;


    public void setInfo(String empName, char empGender, int empSSN, int empID,
               String empJobTitle, String empCompanyName, double empSalary){
        name = empName;
        gender = empGender;
        SSN = empSSN;
        ID = empID;
        jobTitle = empJobTitle;
        companyName = empCompanyName;
        salary = empSalary;
    }
    public void getInfo(){
        System.out.println("Name: "+name+"\nGender: "+gender+"\nSSN: "+SSN+"\nID: "+ID+"\nJob Title: "+
    jobTitle+"\nCompany Name: "+companyName+"\nSalary: "+salary);
    }
    public void attendMeeting(boolean isAttend){
        if(isAttend==true){
        System.out.println(name+" attended  the meeting");
        }else{
            System.out.println(name + " didn't attend the meetings");
        }
    }
public void working(int years){
        if(years>=7){
            System.out.println(name+" is senior");
        }else{
            System.out.println(name+" Rockie");
        }
}
}
/*
2. Employees:
            Attributes:
                name, gender, SSN, ID, jobTitle, companyName, salary
            Actions:
                setInfo
                getInfo
                attendMeeting
                working
        create an arraylist of Emplooyee and store 5 employee objects
        remove all employees from the list who are making less than 100K
        NO seperate classes
 */