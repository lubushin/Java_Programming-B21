package day38_StaticKeyWord;

import java.text.DecimalFormat;

public class SalaryCalculator {
    /* Create a custom class called SalaryCalculator
                    Attributes:
        hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax
                    Methods:
        calculateSalary: returns the annual salary//before tax
        calculateStateTax: returns the total tax
        calculateFederalTax: returns the total tax
        calculateTotalTax: returns the total tax
        calculateSalaryAfterTax: returns the salary after calculator
 setInfo: accepts four arguments (hourlyRate, weeklyHours, stateTax, federalTax) and
 iitializes all instances
                        toString() method
 */

    public double  hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax;
   public void setInf0(double hourlyRate, double weeklyHours,double stateTaxRate, double federalTaxRate){

       this.hourlyRate = hourlyRate;
       this.weeklyHours = weeklyHours;
       this.stateTaxRate = (stateTaxRate>1)? stateTaxRate/100 : stateTaxRate;
       this.federalTaxRate = (federalTaxRate>1)? federalTaxRate/100 : federalTaxRate;
       salary = calculateSalary();
       salaryAfterTax = salaryAftexTax();
   }
   public double calculateSalary(){
       return hourlyRate * weeklyHours * 52;
   }
   public double stateTaxRate(){
       return salary * stateTaxRate;
   }

   public double federalTaxRate(){
       return salary*federalTaxRate;
   }
   public double totalTax(){
       return stateTaxRate()+federalTaxRate();
   }

   public double salaryAftexTax(){
       return salary - totalTax();
   }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate= " + hourlyRate +
                ", weeklyHours =" + weeklyHours +
                ", stateTaxRate =" + stateTaxRate +
                ", federalTaxRate =" + federalTaxRate +
                ", salary= " + salary +
                ", salaryAfterTax= " + salaryAfterTax +
                '}';
    }
   public boolean equals(SalaryCalculator s1){
       return this.salary == s1.salary;
   }
    //public boolean equals(SalaryCalculator s1){
       // return this.salary ==s1.salary;
}



  /*public double hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax;

  public void setInfo(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate){ this.hourlyRate  = hourlyRate;
   this.weeklyHours = weeklyHours;
   this.stateTaxRate = (stateTaxRate>1)? stateTaxRate / 100: stateTaxRate;//8 = 0.08
   this.federalTaxRate = (federalTaxRate>1)? federalTaxRate /100 : federalTaxRate;
   salary = calculateSalary();
   salaryAfterTax = calculateSalaryAfterTax();

  }

  public double calculateSalary(){
      return hourlyRate * weeklyHours * 52;
  }

  public double calculateStateTax(){
    return  salary * stateTaxRate;
  }

  public double calculateFederalTax(){
      return salary * federalTaxRate;
  }

  public double calculateTotalTax(){
      return calculateStateTax() + calculateFederalTax();
  }

  public double  calculateSalaryAfterTax(){
      return salary - calculateTotalTax();
  }

  public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate= $" + hourlyRate +
                ", salary= $" + salary +
                ", salaryAfterTax= $" + salaryAfterTax +
                '}';
    }

    public boolean equals(SalaryCalculator s1){
      return this.salary ==s1.salary;

    }
}*/

/* Create a custom class called SalaryCalculator
                    Attributes:
        hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax
                    Methods:
        calculateSalary: returns the annual salary//before tax
        calculateStateTax: returns the total tax
        calculateFederalTax: returns the total tax
        calculateTotalTax: returns the total tax
        calculateSalaryAfterTax: returns the salary after calculator
 setInfo: accepts four arguments (hourlyRate, weeklyHours, stateTax, federalTax) and
 iitializes all instances
                        toString() method
 */