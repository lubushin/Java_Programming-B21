package day47_Abstraction.EmployeeTask;

public class Tester extends Employee {
public Tester(String name, int age, char gender, String jobTitle, String ID, double salary) {
super(name, age, gender, jobTitle, ID, salary);
    }
    @Override
    protected void work(){
        System.out.println("Testing is testing the application");
    }
    @Override
    public void sleep() {
        System.out.println("Tester usually sleeps 8 hours");

        //public void smokeTesting() {

            System.out.println("Smoke Testing");
        }
    }


