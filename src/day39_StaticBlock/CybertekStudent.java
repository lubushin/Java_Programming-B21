package day39_StaticBlock;

public class CybertekStudent {

    public String name,gender;
    public int age;

    public static String schoolName,dreamJob;
    public static Boolean hasReplit,hasFlipGrid;

    static{
        schoolName = "MIT";
        dreamJob = "SDET";
        hasReplit = true;
        hasFlipGrid = true;
    }

    public void setInfo(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String toString(){
      return "Student: Name = "+name+", Gender = "+gender+", Age = "+age+", School = "+schoolName+", Dream Job = "+dreamJob;
    }






    /*public String name, gender;
    public int age;

    public static String schoolName, dreamJob;
    public static boolean hasReplit, hasFlipGrid;
    static{
        schoolName = "Cybertek School";
        dreamJob = "SDET";
        hasReplit = true;
        hasFlipGrid = true;
    }

    public void setInfo(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", School name= "+ schoolName+
                '}';
    }*/
}
