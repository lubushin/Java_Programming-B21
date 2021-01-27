package day45_Exceptions;

import java.time.LocalTime;

public class EveryDayLunchBreak {

    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime lunchTime = LocalTime.of(1,0);

        if(!currentTime.equals(lunchTime)){
            throw new LunchBreakException("Muhtar we need to go to Lunch!");
        }else{
            System.out.println("Continue");
        }
    }
}
