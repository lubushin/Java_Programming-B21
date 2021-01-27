package Abstract_Practice.ShapeTask;

public class PR {
}
/*
RemoteDriverTask:
        JavaScriptExecuter
            executeScript(script);
        TakeScreenShot:
            takeScreenShot();
        WebDriver
            get(URL);
            close();
            quite();

        RemoteDriver implements WebDriver, TakeScreenShot, JavaScriptExecuter:
            version
            toString
        ChromeDriver
        FireFoxDriver
        OperaDriver
        EdgeDriver
        CybertekDriver
========================================================
01/20/2021
Topics: OOP Polymorphism Intro:
                instanceof
                rules
                reference castings
Package name: day50_Polymorphism

warmup task:
    1. create an interface named Downloadable:
            abstrct method: download();
    2. create an interface named AndroidApp that can inherit from Downloadable
            variable: AppStoreName

    3. create an interface named AppleApp that can inherit from Downloadable
            variable: AppStoreName
    4. create an abstract class named Phone
            instance variables: brand, model, price, size
            abstract methods: texting(), calling()
            add constructor that can initialize the fields
            if the price is set to negative, the system should throw an exception with a message of:
                    Invalid Price, cannot be negative
    5. create a class named iPhone that can inherit from AppleApp and Phone
            actions: texting(), calling(), faceTiming()
            if the price of Iphoen is more than 1500, the system should throw an exception with a message of:
                    Invalid Price, Iphone' price cannot more than 1500
    6. create a class named Samsung that can inherit from AndroidApps and Phone
            actions: texting(), calling(), freezing()
             if the price of Samsung is more than 1200, the system should throw an exception with a message of:
                    Invalid Price, Samsung' price cannot more than 1200
IS A relation:
        class  extends class
        class  implements interface(s)
        interfaces extends interface(s)
        class extends  class  implements interface(s)
        interface    class  // interface cannot inherit from class
Polymorphism: object' behave in different forms
            Reference type decides what can be called
            Object type decides which implementation to execute

        WebDriver driver ;
        diver = new ChromeDriver();
        driver = new FireFoxDriver();
        driver =new SafariDriver();
        WebDriver driver = new FireFoxDriver();
        driver.get(URL)

Task:
    create a class named AppleInc:
        create 2 objects of testers, developers & UberDrivers (use the class in pakcage day47)
        store them all into an array of Employee
        Creta an arraylist named scrumMember
        iterate the Employees array and if the employee is tester or developer, add them into scrumMember ArrayLis
next week:
    Collection
    Map
    GC, Enum

 */