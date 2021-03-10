package day54_Map_Recap;

public class String_Buffer_Builder {
    public static void main(String[] args) {
        String str = "Cybertek";
        str.concat(" School");
        System.out.println(str);//print "Cybertek"-string is immutable
        System.out.println("======================");
        StringBuilder stringBuilder = new StringBuilder("Cybertek");
        stringBuilder.append(" School");
        stringBuilder.reverse();
        System.out.println(stringBuilder);//Cybertek School - SB is mutable
    }
}
