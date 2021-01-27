package day40_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MySalaries {
    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator(40,65,9,20);
        SalaryCalculator salary2 = new SalaryCalculator(40,55,0,22);
        SalaryCalculator salary3 = new SalaryCalculator(40,45,7,20);
        SalaryCalculator salary4 = new SalaryCalculator(40,70,10,20);
        SalaryCalculator salary5 = new SalaryCalculator(40,75,15,20);

        //what the maximum salary after tax
        ArrayList<SalaryCalculator> salaries = new ArrayList<>();
        salaries.addAll(Arrays.asList(salary1,salary2,salary3,salary4,salary5));

        double maxSalaryAfterTax = salaries.get(0).salaryAfterTax;
        double minSalaryAfterTax = salaries.get(0).salaryAfterTax;
        double maxTotalTax = salaries.get(0).totalTax;
        double minTotalTax = salaries.get(0).totalTax;

        for(SalaryCalculator each : salaries){
           maxSalaryAfterTax=Math.max(each.salaryAfterTax, maxSalaryAfterTax);
            minSalaryAfterTax=Math.min(each.salaryAfterTax, maxSalaryAfterTax);

            maxTotalTax = Math.max(each.totalTax, maxTotalTax);
            minTotalTax = Math.max(each.totalTax, minTotalTax);


            System.out.println(each.salaryAfterTax);
        }
        System.out.println(maxSalaryAfterTax);

        System.out.println("===========================================");


    }
}
