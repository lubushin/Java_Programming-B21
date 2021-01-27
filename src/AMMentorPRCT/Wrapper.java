package AMMentorPRCT;

public class Wrapper {
    public static void main(String[] args) {
        //we need wrapper to create the object
        //methods : parseInt //valueOf

        String str = "1892";
        System.out.println(str+1);
        int num1 = Integer.parseInt(str);
        System.out.println(num1+1);

        //valueOf
        int num2 = 3567;
        String result = String.valueOf(num2);
        System.out.println(result+1);//35671

    }
}
