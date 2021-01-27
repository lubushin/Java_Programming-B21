package Practice_11_25_2020;

public class MethodPractice {

public static void eligibleToVote(int age,boolean isUSCitizen){
        if(age <18){//age is not qualified
            System.out.println("You must be 18 years old");
            return;// exit the statement
        }
      if(isUSCitizen == false) {//if the person the US Citizen
          System.out.println("You must be US Citizen in order to vote");
        return;// exit the statement
      }
        System.out.println("You are eligible to vote");

    }

}