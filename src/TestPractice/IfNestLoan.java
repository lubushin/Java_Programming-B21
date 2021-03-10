package TestPractice;

public class IfNestLoan {
    public static void main(String[] args) {
       double minSalary = 23000;
       int jobHistory = 2;
       int creditScore = 600;
         if(minSalary >=30000) {
           if (jobHistory >= 2) {
               if (creditScore >= 680) {
                   System.out.println(" You qualify for loan");
               }else {
                   System.out.println("you credit history should be 680 or greater");
               }}
           else{
                   System.out.println("Your should be in same job 2 years");
               }
           }else{
                   System.out.println("you min salary should be 30000");
               }

           }
               }





       /* if(minSalary >= 30000){

            if(jobHistory >=2){

                if(creditScore >= 680){
                    System.out.println("You are qualified for loan");
                }else{
                    System.out.println("You must have at least 680 credit score");
                }

            }else{
                System.out.println("You must be on the job at least for 2 years");
            }

        }else{
            System.out.println("You must have minimum of 30k salary first");
        }

*/



