package day45_Exceptions.PhoneTask;

public class WalMArt {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("12 ProMax",1300);
        Samsung samsung = new Samsung("S320",1200);
        Nokia nokia = new Nokia("Brick", 300);
        HuaWei huawei = new HuaWei("gh34", 400);

        //iphone.call(number);
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);
        System.out.println(huawei);

        iphone.faceTime(12345);
        samsung.freeze();
        nokia.selfDefence();
        nokia.breakTheFloor();
        huawei.spy();
    }
}
