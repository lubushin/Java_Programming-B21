package day50_Polymorphism.PhoneTasks;

public final class Samsung extends Phone implements AndroidApps{

    public Samsung(String model, String color, double price) {
        super("Sumsung", model, color, price);
        if(price > 1200){
            throw new RuntimeException("Invalid Price, Samsung' price cannot more than 1200");
        }
    }
    @Override
    public void downloadApp() {
        System.out.println("Sumsung downloads Apps from "+ AppStoreName);
    }

    @Override
    public void text() {
        System.out.println("Sumsung is texting");
    }

    @Override
    public void call() {
        System.out.println("Sumsung is calling");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", OS ='" + OS + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
    6. create a class named Samsung that can inherit from AndroidApps and Phone
            actions: texting(), calling(), freezing()
             if the price of Samsung is more than 1200, the system should throw an exception with a message of:
                    Invalid Price, Samsung' price cannot more than 1200

 */