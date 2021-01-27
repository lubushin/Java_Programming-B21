package day35_CustomClass;

public class StudentInfo {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setInfo("Tom",21,'M',"TN1234");
        student1.getInfo();

        student2.setInfo("Mary", 19,'F', "MT24356");
        student2.getInfo();

        student3.setInfo("Bill", 23, 'M',"BC8970");
        student3.getInfo();

        student1.study("math");
        student1.eat("Pizza");
        student3.sleep(6);
        student2.eat("Lozania");
        student2.study("Java");
        student3.study("Biology");
    }
}
