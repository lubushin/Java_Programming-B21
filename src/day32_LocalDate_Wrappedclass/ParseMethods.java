package day32_LocalDate_Wrappedclass;

public class ParseMethods {
    public static void main(String[] args) {
        String data1 = "123";
        System.out.println(data1+3);

        int num1 = Integer.parseInt(data1);//none
        //        primitive = primitive

        Integer num2 = Integer.parseInt(data1);//autoboxing

        //wrapper class<== primitive;
        System.out.println(num1 + 3);
        System.out.println("================================================");

        String s2 = "2.5";
       double d1 = Double.parseDouble(s2);//none
        //primitive <== Primitive
        Double d2 = Double.parseDouble(s2);//auto boxing
        //wrapper class<== primitive;
        System.out.println(d1+1);

        System.out.println("=========================================================");
        String s3 = "Maybe";//by default value of boolean is false
        boolean r1 = Boolean.parseBoolean(s3);//none
        Boolean r2 = Boolean.parseBoolean(s3);//auto boxing
        System.out.println(r1);

        String s4 = "TRuE";
        boolean r3 = Boolean.parseBoolean(s4);
        System.out.println(r3);

    }
}
