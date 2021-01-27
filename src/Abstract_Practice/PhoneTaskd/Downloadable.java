package Abstract_Practice.PhoneTaskd;

public interface Downloadable {

    void downloadable();
}
/*
    1. create an interface named Downloadable:
            abstrct method: download();
    2. create an interface named AndroidApp that can inherit from Downloadable
            variable: AppStoreName

    3. create an interface named AppleApp that can inherit from Downloadable
            variable: AppStoreName
    4. create an abstract class named Phone
            instance variables: brand, model, price, size
            abstract methods: texting(), calling()
            add constructor that can initialize the fields
            if the price is set to negative, the system should throw an exception with a message of:
                    Invalid Price, cannot be negative
    5. create a class named iPhone that can inherit from AppleApp and Phone
            actions: texting(), calling(), faceTiming()
            if the price of Iphoen is more than 1500, the system should throw an exception with a message of:
                    Invalid Price, Iphone' price cannot more than 1500
    6. create a class named Samsung that can inherit from AndroidApps and Phone
            actions: texting(), calling(), freezing()
             if the price of Samsung is more than 1200, the system should throw an exception with a message of:
                    Invalid Price, Samsung' price cannot more than 1200

 */
