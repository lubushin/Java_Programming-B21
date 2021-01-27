package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        String str = new String("Batch21");

        Student student1 = new Student();
        student1.setInfo("Aaron",'M', LocalDate.of(2001,11,24),"AC345",3.8);
        System.out.println(list.toString());
        System.out.println(str);

        System.out.println(student1.toString());
        System.out.println(student1);

        System.out.println("=====================================================");
        Student student2 = new Student();
      student2.setInfo("Daniel", 'M', LocalDate.of(1996,11,24),"DB1234",3.98);
        System.out.println(student2);
        System.out.println("======================================");
//Student student3 = new Student();
//student3.setInfo("Mary", 'F',);

        System.out.println("===========================================");
        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(student1,student2));
        System.out.println(studentList);
        System.out.println("=================================================");
        Student[] students = {student1, student2};

        System.out.println(  Arrays.toString( students ) );

        System.out.println("===========================================================");
        // find the student who has ID of C456

        for (Student each : students){
            if( each.ID.equals("DB1234") ){
                System.out.println(each);
            }
        }
        System.out.println("=================================================");
        Student s1 = new Student();
        Student s2 = s1;

        s1.setInfo("Aaron",'M', LocalDate.of(2001,11,24),"AC345",3.8);
        s2.setInfo("Daniel", 'M', LocalDate.of(1996,11,24),"DB1234",3.98);
        System.out.println(s1);
        System.out.println(s2);

    }

}
