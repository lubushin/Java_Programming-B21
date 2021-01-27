package day47_Abstraction.EmployeeTask;

public class UberDriver extends Employee {

    public UberDriver(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    @Override
    public void work() {
        System.out.println("Drive Passsangers");
    }

    @Override
    public void sleep() {
        System.out.println("UberDriver drive sleeps 6 hours");
    }
}
