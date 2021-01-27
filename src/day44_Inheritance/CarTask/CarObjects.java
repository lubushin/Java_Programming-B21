package day44_Inheritance.CarTask;

public class CarObjects {
    public static void main(String[] args) {
        Honda honda = new Honda("Fit","neon blue", 19000,2018);
        honda.start();
        System.out.println(honda);

        Mercedes mercedes = new Mercedes("GL-250","white", 48000, 2016);
    mercedes.start();
        System.out.println(mercedes);

        Jeep jeep = new Jeep("Cherokee","red",22000,2019);
        jeep.start();
        System.out.println(jeep);

        Tesla tesla = new Tesla("Model Y", "Grey",60000,2019);
        tesla.start();
        System.out.println(tesla);



    }
}
