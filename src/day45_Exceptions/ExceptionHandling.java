package day45_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        //StringIndexoutofBound

        String str = "Cybertek";

        try {
            System.out.println(str.substring(200, 300));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("===================================");

        //Thread.sleep
try {
    Thread.sleep(2000);
}catch(InterruptedException e){

}

        System.out.println("=====================================");
//unchecked exception always RuntimeException
try{
        System.out.println(10 / 0);
}catch (RuntimeException e ){
    System.out.println("Unchecked exception occurred: "+ e.getMessage());
    e.printStackTrace();
}


        System.out.println("Test completed");
    }
}
