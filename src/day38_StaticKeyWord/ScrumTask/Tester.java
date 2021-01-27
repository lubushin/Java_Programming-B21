package day38_StaticKeyWord.ScrumTask;

public class  Tester {
    public String name, ID, JobTitle, companyName;
    public double salary;
    public char gender;

    public void setInfo(String name, String ID, String jobTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.ID = ID;
        JobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;

    }

    public void smokeTesting(){
        System.out.println(name+" is performing smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employerID='" + ID + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
/*
create a class called Tester
                    Attributes:
                        name, employeeID, JobTitle, Salary
                        isHuman, isCybertekStudent
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()
 */