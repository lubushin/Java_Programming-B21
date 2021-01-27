package day42_Inheritance.DeviceTask;

public class DeviceObjects {
    public static void main(String[] args) {
        TV tv = new TV("Sony", "LX32",600.55);
        System.out.println(tv);
tv.channelUp();
tv.channelDown();
tv.turnOn();
tv.turnOff();
System.out.println(TV.hasBattery);
        System.out.println("=============================================");
Phone phone= new Phone("IPhone", "12 ProMax", 1100);
phone.turnOn();
phone.turnOff();
phone.call(87654);
phone.text(657329);

    }
}
