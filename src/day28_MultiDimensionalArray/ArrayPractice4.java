package day28_MultiDimensionalArray;

public class ArrayPractice4 {
    public static void main(String[] args) {


       String[] employeeNames = {"Sutbi","Lyuba", "Ken", "Aijamal", "Hober", "Aliya", "Roman","Pedro"};
        int[] employeeSalary = {100000, 125000,120000, 105000,115000, 125000,125000, 100000};
       int max = employeeSalary[0];
for(int each:employeeSalary){
    if(each> max){
        max = each;

    }
}
        System.out.println("Max: "+max);
for(int i = 0; i<= employeeNames.length-1;i++) {
    if (max == employeeSalary[i]) {
        System.out.println(employeeNames[i]);
    }
}

        /* int max = employeeSalary[0];
         for(int each: employeeSalary){
             if(each>max){
                 max=each;
             }
         }//to find max salary
        System.out.println("Max: "+max);

         for(int i = 0; i<= employeeNames.length-1;i++){
             if(max == employeeSalary[i]){//if employe's salary is egual to max

                 System.out.println(employeeNames[i]);*/
             }
         }





