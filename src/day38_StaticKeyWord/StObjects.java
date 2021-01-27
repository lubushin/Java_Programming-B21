package day38_StaticKeyWord;

public class StObjects {
    public static void main(String[] args) {

        CybertekSt student1 = new CybertekSt();
        student1.setInfo("Aysel", 24, 5, 'F');

        CybertekSt student2 = new CybertekSt();
       student2.setInfo("Erjon", 22,17,'M');

        CybertekSt student3 = new CybertekSt();
        student3.setInfo("Afrooz", 25,3,'M');

       CybertekSt.getSchoolInfo();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

       CybertekSt.getSchoolInfo();
    }
}
