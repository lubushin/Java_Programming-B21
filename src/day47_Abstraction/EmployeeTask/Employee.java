package day47_Abstraction.EmployeeTask;

public abstract class Employee extends Person{

    public String jobTitle, ID;
    public double salary;

    public Employee(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }

    abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
