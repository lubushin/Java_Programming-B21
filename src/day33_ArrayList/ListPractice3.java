package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice3 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Katy");//0
        students.add("Lena");//1
        students.add("Ken");//2
        students.add("Amir");//3
        students.add("Ilgar");//4
        students.add("Amir");//5
        students.add("Nadira");//6
        System.out.println(students);

        students.remove(1);
        System.out.println(students);

        students.remove(3);
        System.out.println(students);

        students.remove("Amir");//removes first appeared "Amir"
        System.out.println(students);

        students.remove(students.size()-1);
        System.out.println(students);
        System.out.println("=========================================");
        //clear : delete everything, index: 0

        students.clear();
        System.out.println(students);
    }
}
