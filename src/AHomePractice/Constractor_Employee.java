package AHomePractice;

public class Constractor_Employee {
    public String name, jobTitle, ID;
    public double salary;
    public Constractor_Employee(String name){
    this.name = name;
    }
    public Constractor_Employee(String name, String jobTitle){
        this( name);
        this.jobTitle = jobTitle;
    }
    public Constractor_Employee(String name, String jobTitle, String ID){
        this(name, jobTitle);
        this.ID = ID;
    }

    public Constractor_Employee(String name, String jobTitle, String ID, double salary){
      this(name, jobTitle, ID);
      this.salary = salary;
    }

    public String toString() {
        return "Constractor_Employee{" +
                " name ='" + name + '\'' +
                ", jobTitle ='" + jobTitle + '\'' +
                ", ID ='" + ID + '\'' +
                ", salary =" + salary +
                '}';
    }
}

/*
/*
class Name: Employee
        instance variables:
        name, jobTitle, ID, salary
        1st constructor: initialize the name of the employee
        2d constructor: initialize the name, jobTitle of the employee
        (MUST apply constructor Call)
        3rd Constructor: initialize the name, jobTitle, ID of the employee
        (MUST apply constructor Call)
        4th Constructor: initialize all the instance of the employee
        (MUST apply constructor Call)
        Instance methods:
        toString()
*/
