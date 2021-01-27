package Abstract_Practice.PhoneTaskd;

import day50_Polymorphism.PhoneTasks.IPhone;

public class PhoneObjects {
    public static void main(String[] args) {
        IPhone iphone = new IPhone("12","red",1000);
        System.out.println(iphone);
        iphone.text();
        iphone.text();
        iphone.downloadApp();
    }
}
