package Practice_11_25_2020;

public class MethodPractice2 {
    public static void main(String[] args) {
      max(100,200);
        System.out.println(max(100,200)*2);
        System.out.println(max(100,600,150));

        System.out.println( min(89,34));
        System.out.println(min(20,40, 98));
        System.out.println(min(345,768,45,13));

        System.out.println(min(34.5,3));
        System.out.println(min(23.8,45.3,8.1));
        System.out.println(min(45.2,45.6,89.4,12.4));
    }

    public static int max(int a,  int b){
        int maximum = (a>=b? a: b);
        return maximum;
    }

    public static int max(int a, int b, int c){
        return max(max(a,b), c);
    }


    public static double max(double a, double b){
        return (a>=b)? a : b ;
    }

public static int min(int a, int b){
        int min = (a<=b? a : b);
        return min;
}
public static int min(int a, int b, int c){
        return min(min(a,b),c);
}
public static int min(int a, int b, int c, int d){
        return min(min(a,b,c),d);
}

public static double min(double a, double b){
        double min = (a<=b)? a : b;
        return min;
}

public static double min(double a, double b, double c){
        return min(min(a,b),c);
}

public static double min(double a, double b, double c, double d){

        return min(min(a,b,c),d);
}
     /*
     create methods for min number

     make sure that max method also accepts decimals
*/

}
