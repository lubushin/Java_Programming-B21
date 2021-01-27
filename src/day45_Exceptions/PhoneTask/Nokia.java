package day45_Exceptions.PhoneTask;

public final class Nokia extends Phone{
    public Nokia(String model, double price) {
        super("Nokia", model, "Finland", price);
    }

    public void selfDefence(){
        System.out.println(brand + " " + model + " is for self defence ");
    }
    public void breakTheFloor(){
        System.out.println(brand + " " + model + " can break the floor ");
    }
}
