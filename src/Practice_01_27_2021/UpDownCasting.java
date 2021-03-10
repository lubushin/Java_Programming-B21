package Practice_01_27_2021;

import day45_Exceptions.PhoneTask.*;
import day49_Abstarction.ShapeTasks.Cube;
import day49_Abstarction.ShapeTasks.Volume;

public class UpDownCasting {
    public static void main(String[] args) {
        //reference type castings

        Phone phone = new Iphone("12",1100);//up casting
            //phone.faceTime(122345);
        //((Iphone) phone ).faceTime(6598347);
        //((Iphone)phone.faceTime

        Iphone iphone = (Iphone) phone;// down casting


        iphone.faceTime(12436);
        iphone.faceTime(123648,54678);

        //Phone phone2 = (Samsung) phone;

        System.out.println("======================================");

        Phone phone2 = new Nokia("91",150);
        ((Nokia)phone2).breakTheFloor();
        ((Nokia)phone2).selfDefence();

        //((Iphone)phone2).faceTime(75979);
        //ClassCastException:does not have IS A Relationship Nokia and Iphone
        System.out.println("=======================================");
    Phone phone3 = new HuaWei("...",150);
        ((HuaWei)phone3).spy();
        //((Iphone)phone3).faceTime(5279);
    //NO CASTING because there IS NOT IS A RELATIONSHIP

        System.out.println("=============================");
        Phone phone4 = new Samsung("S320",900);
        //((HuaWei)phone4).spy();
        //((Nokia)phone4).selfDefence();
        //((Iphone)phone4).faceTime(74587);
        ((Samsung)phone4).freeze();

        System.out.println("=================================");
//Interface Volume
        //Volume s1 = new Circle(3);
        Volume v = new Cube(3);//up casting
        double area = ((Cube)v).area();
        double volume = v.volume();

        System.out.println(area);
        System.out.println(volume);

    }
}
