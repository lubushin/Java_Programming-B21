package AHomePractice;

public class TV extends Device {
    public TV(String brand, String model, double price){
        super(brand, model, price);
    }
    private void remote(){
        System.out.println("TV "+brand+ " "+"has a remote");
    }

    public String toString() {
        return "TV{" +

                " brand ='" + brand + '\'' +
                ", model ='" + model + '\'' +
                ", price =" + price +
                '}';
    }
}
