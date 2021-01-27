package day29_Methods;

public class VoidMethodsPractice3EligToVote {
    public static void main(String[] args) {
        eligibleToVote("USA",45,true);
        eligibleToVote("Canada", 56,true);
    }

    public static void eligibleToVote(String citizenShip, int age, boolean isAlive){
        if(citizenShip.equalsIgnoreCase("USA")){
          if(isAlive){
              if(age>=18){
                  System.out.println("You are eligible to vote");
              }else{
                  System.out.println("You must be 18 years old");
              }
          } else{
              System.out.println("You must be alive");
          }
        }else{
            System.out.println("YOU must be citizen of USA");
        }

    }
}
