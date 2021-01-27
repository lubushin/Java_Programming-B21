package day39_StaticBlock;

import day37_CustomClass.Employee;

public class StaticBlocks {
    public static String company;
    public static Employee employee1;
    public static int b;
    public static boolean isEmployed;

    public int a;

    //xcelSheet

 static{
        company = "Capital One";
        isEmployed = true;
 employee1 = new Employee();
 employee1.setInfo("John",company,"SDET","J897","M",40,60);
    //a = 100;
    b = 200;
    }

   /* public static void main(String[] args) {
        company = "Capital One";
        isEmployed = true;
        employee1 = new Employee();
        employee1.setInfo("John",company,"SDET","J897","M",40,60);
        //a = 100;
        b = 200;
        System.out.println(company);
        System.out.println(employee1);
        System.out.println(b);
        System.out.println(isEmployed);}*/

    }


