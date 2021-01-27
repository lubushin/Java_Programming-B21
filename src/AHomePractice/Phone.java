package AHomePractice;

public class Phone extends Device{

public Phone(String model, double price) {
 super("Apple", model, price);
    }
    public void dialNumber(String phoneNumber){
        System.out.println(brand+" "+model+ "can dial a number");
    }

   public String toString() {
   return brand+" "+model+ "$"+price;
    }
}

