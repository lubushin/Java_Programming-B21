package AHomePractice;

import java.util.ArrayList;
import java.util.Arrays;

public class BestBuy {
    public static void main(String[] args) {
    TV tv1 = new TV("Hitachi", "H12",700.40);
    TV tv2 = new TV("Sony", "S234", 567.78);
    Phone phone1 = new Phone("GP12", 786);
    Phone phone2 = new Phone("GP10", 890);

    String samsungPhone = "Samsung";
    Phone phone3 = new Phone("F1", 489);
    phone3.brand = samsungPhone;
        System.out.println(phone3);
        System.out.println(Phone.madeIn);
        System.out.println(Phone.hasBattery);
        System.out.println(Phone.hasPowerButton);
        System.out.println("=================================");
        ArrayList<Device> devices = new ArrayList<>(Arrays.asList(tv1,tv2,phone1,phone2,phone3));
        //devices.addAll(Arrays.asList(tv1,tv2,phone1,phone2,phone3));
        System.out.println(devices);
        System.out.println("===============================");

    }

}
/*
Create 2 TV objects.
Create 2 Phone Objects.
Run a unique method for each.
Create an arrayList of DEVICE.
       -> Inside I want you to .add TV and
       Phone objects

 */