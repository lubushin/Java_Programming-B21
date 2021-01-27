package Abstract_Practice.PhoneTaskd;

import day50_Polymorphism.PhoneTasks.AppleApps;

public class Iphone extends Phone implements AppleApps {
    public Iphone(String model, double price, double size) {
        super("IPhone", model, price, size);
        if(price>1500){
            throw new RuntimeException(" Invalid Price, Iphone' price cannot more than 1500");
        }
    }

    @Override
    public void texting() {
        System.out.println("Iphone is texting");
    }

    @Override
    public void calling() {
        System.out.println("Iphone is calling");
    }

    @Override
    public void downloadApp() {
        System.out.println("Iphone downloads");
    }

}
/*
    5. create a class named iPhone that can inherit from AppleApp and Phone
            actions: texting(), calling(), faceTiming()
            if the price of Iphoen is more than 1500, the system should throw an exception with a message of:
                    Invalid Price, Iphone' price cannot more than 1500
 */