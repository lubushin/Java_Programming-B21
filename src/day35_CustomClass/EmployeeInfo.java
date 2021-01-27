package day35_CustomClass;

import day35_CustomClass.Employee;

public class EmployeeInfo {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        Employee emp5 = new Employee();

        emp1.setInfo("Cristopher Link", 'M', 1234569, 35463728,
                "QA", "Amazon", 110000);
        emp1.getInfo();
        System.out.println();
        emp2.setInfo("Ruth Black", 'F', 234569807,1532076,"SDET",
                "Google", 155000);
        emp2.getInfo();
        System.out.println();
        emp3.setInfo("Steve Backer", 'F', 354094587, 36756465, "Psychologist",
                "Google", 99000);
        emp3.getInfo();
        System.out.println();
        emp4.setInfo("Alina Dak", 'F', 2340986,45637,"QA", "Amazon",
                89000);
        emp4.getInfo();
        System.out.println();
        emp5.setInfo("Dan Klock", 'M', 234789645, 46589, "SDET",
                "Google", 178000);
        emp5.getInfo();
    }
}
