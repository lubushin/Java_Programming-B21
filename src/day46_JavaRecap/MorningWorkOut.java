package day46_JavaRecap;

public class MorningWorkOut {
    public static void main(String[] args) {
        for(int i =1; i<=30; i++){
            System.out.println("Push up " + i);
            sleep(1.5);
        }
        System.out.println("==============================================");
        for(int i =1; i<=20; i++){
            System.out.print("Pull up "+ i +", ");
            sleep(2.5);
        }

    }


    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds * 1000));//millis takes only long
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

/*
 1. Do 30 push ups
                try pausing 1.5 seconds in each
        2. Do 20 Pull up
                try pausing 2.5 seconds in each

 */
