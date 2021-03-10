package day28_MultiDimensionalArray;

public class ArrayPractice3_Salary {
    public static void main(String[] args) {

        double[] salary = {100000.5, 110000.5,120000.5,95000.5,90000.5};
       double sum = 0;
       double max = salary[0];
       double min = salary[0];
       for(double each: salary){
           sum+=each;
          for(int i =0; i<= salary.length-1;i++){
              if(salary[i] > max) {
                  max = salary[i];
              }
              if(salary[i]<min){
                  min = salary[i];
              }
          }
       }
        System.out.println("Sum: "+sum);
        System.out.println(("Average: "+ sum/ salary.length));
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);

        /*double sum = 0;

        double max = salary[0];
        double min = salary[0];

        for(double each : salary){
            sum+=each;
            if(each > max){
                max = each;
            }
            if(each<min){
                min = each;
            }

        }
        System.out.println("Total: "+sum);
        System.out.println("Average salary of employees: "+ (sum / salary.length));
        System.out.println("Maximum salary: $" + max);
        System.out.println("Minimum salary: $" + min);*/
    }
}
