package day47_Abstraction.EmployeeTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    @Override
    public void work() {
        System.out.println("Developer works ");
    }

    @Override
    protected void sleep() {
        System.out.println("Developer sleeps 7 hours");
    }
}
