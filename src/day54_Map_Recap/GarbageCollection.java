package day54_Map_Recap;

import day46_JavaRecap.CarTask.BMW;
import day46_JavaRecap.CarTask.Car;
import day49_Abstarction.ShapeTasks.Circle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GarbageCollection {
    public static void main(String[] args) {
        String str1 = "Muhtar";
        str1 = "Kuzzat";//"Muhtar" is not referenced
        str1 = "Gurha";//"Kuzzat" is not referenced
        str1 = "Saim";//"Gurhan" is not referenced
        System.out.println(str1);

        Circle c1 = new Circle(5);
        //c1=null;//c1 is unreferenced, will be pick up by garbage collector
        System.out.println(c1);

        Car car1 = new BMW("X5","red",1990,5000);
        car1 = new BMW("X6","white",2019,25000);//BMW X5 is unreferenced
        System.out.println(car1);

        System.out.println("=====================================");
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list1 = new ArrayList<>(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list1);

        System.out.println("========================================");

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> l2 = l1;
        l2.add(6);
        System.out.println(l2);
        System.out.println(l1);

        l1.removeAll(Arrays.asList(1,2,3));
        System.out.println(l1);
        System.out.println(l2);


    }
}
