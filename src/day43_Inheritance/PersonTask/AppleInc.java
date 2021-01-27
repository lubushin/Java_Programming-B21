package day43_Inheritance.PersonTask;

public class AppleInc {//AppleInc HAS A Tester
    public static void main(String[] args) {
        Tester tester1 = new Tester("John", 24,'M',60,"SDET","JK435");
        tester1.eat();
        tester1.sleep();
        tester1.work();
        tester1.testing();
        System.out.println(tester1);

        Developer developer1 = new Developer("Mike",45,'M',80,"Senior Developer","MT6778");
        developer1.eat();
        developer1.sleep();
        developer1.work();
        developer1.coding();
        System.out.println(developer1);


    }
}
