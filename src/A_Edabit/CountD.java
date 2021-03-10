package A_Edabit;

public class CountD {
    public static void main(String[] args) {
        String s= "dddrrD";
        System.out.println(countsDs(s));
    }

    public static int countsDs(String s){
        int count = 0;
        for(int i=0; i<s.length();i++){

            char result = s.toLowerCase().charAt(i);
           if(result=='d'){
               count++;
           }

        }

        return count;
    }
}
