package day33_ArrayList;

public class WrapperlassPractice {
    public static void main(String[] args) {
        String str = "a1b2c3d5";//1:49(AsKi table); 2:50; 3:51
        int sum =0;
        
        for(char each: str.toCharArray()){
            if(Character.isDigit(each)){
             sum+=  Integer.parseInt("" +each);//each digit needs to be converted to string "" ;
            }
            
        }
        System.out.println("sum = " + sum);
    }
}
