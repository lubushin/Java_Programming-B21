package Abstract_Practice.PhoneTaskd;

public abstract class Phone {

    public String brand,model;
    public double price, size;

    public Phone(String brand, String model, double price, double size) {
        if(price<0){
            throw new RuntimeException("Invalid Price, cannot be negative");
        }
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public abstract void texting();
    public abstract void calling();

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
//    4. create an abstract class named Phone
//            instance variables: brand, model, price, size
//            abstract methods: texting(), calling()
//            add constructor that can initialize the fields
//            if the price is set to negative, the system should throw an exception with a message of:
//                    Invalid Price, cannot be negative