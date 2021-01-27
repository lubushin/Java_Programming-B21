package Abstract_Practice.PhoneTaskd;

public class Samsung extends Phone implements AndroidApp{
    public Samsung(String model, double price, double size) {
        super("Samsung", model, price, size);
        if(price>1200){
            throw new RuntimeException("Invalid Price, Samsung' price cannot more than 1200");
        }
    }

    @Override
    public void downloadable() {
        System.out.println("Samsung downloads");
    }

    @Override
    public void texting() {
        System.out.println("Samsung texting");
    }

    @Override
    public void calling() {
        System.out.println("Samsung is calling");
    }
}
/*
    6. create a class named Samsung that can inherit from AndroidApps and Phone
            actions: texting(), calling(), freezing()
             if the price of Samsung is more than 1200, the system should throw an exception with a message of:
                    Invalid Price, Samsung' price cannot more than 1200
 */