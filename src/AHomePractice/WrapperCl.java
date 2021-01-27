package AHomePractice;

public class WrapperCl {
    public static void main(String[] args) {
        String data1 = "123";
        System.out.println((data1 + 5));//1235

        int n1 = Integer.parseInt(data1);
        System.out.println(n1+5);//128

        String d1 = "2.3";
        double data = Double.parseDouble(d1);
        System.out.println(data+1.5);//2.3+1.5=3.8

        String f = "7.8";
        float data3 = Float.parseFloat(f);
        System.out.println(data3+1.1);//8.9000

        System.out.println("==============================");
        String str = "123";
        int num = Integer.valueOf(str);
        System.out.println(num + 4);


        Integer a = 20;
        int data6 = Integer.valueOf(a);
        System.out.println(data6+7);

    }

}
