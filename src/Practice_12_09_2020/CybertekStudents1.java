package Practice_12_09_2020;

public class CybertekStudents1 {
    public String name;
    public int age;
    public char gender;

    public static String schoolName = "Cybertek School", dreamJob = "SDET";
    public static boolean hasReplIt = true, hasFlipGrid = true;

    public void setInfo(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+ gender+", School Name: "+schoolName
                +", Has RepLit:"+hasReplIt+", Has FlipGrid: "+hasFlipGrid+", Dream Job:"+ dreamJob;

    }


}
