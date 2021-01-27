package day47_Abstraction.EmployeeTask;

public class AppleInc {
    public static void main(String[] args) {
Tester tester = new Tester("John", 35,'M',"SDET","GH345",120000);
 Developer developer = new Developer("Matthew", 45,'M',"JavaDeveloper","DF123",150000);
 UberDriver uberDriver = new UberDriver("Ted",29,'M',"Driver","fgh349",60000);

 tester.work();
 tester.sleep();

 developer.sleep();
 developer.work();

 uberDriver.sleep();
 uberDriver.work();
        System.out.println(tester);
        System.out.println(developer);
        System.out.println(uberDriver);

    }
}