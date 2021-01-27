package day38_StaticKeyWord;

public class SalaryCalculateObjects {
    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator();
        salary1.setInf0(48,40,7,20);
        System.out.println(salary1);

        SalaryCalculator salary2 = new SalaryCalculator();
        salary2.setInf0(58,40,8,20);
        System.out.println(salary2);

        System.out.println(salary1.equals(salary2));



        /*SalaryCalculator salary1 = new SalaryCalculator();
        salary1.setInfo(72,40,8,22);
        System.out.println(salary1);

        SalaryCalculator salary2 = new SalaryCalculator();
        salary2.setInfo(55,40,8,22);
        System.out.println(salary2);

        System.out.println(salary1.equals(salary2));*/

    }
}
