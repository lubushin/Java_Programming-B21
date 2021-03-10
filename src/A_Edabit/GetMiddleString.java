package A_Edabit;

public class GetMiddleString {

    public static void main(String[] args) {
        String word = "capra";
        String word1="cara";
        System.out.println(getMiddle(word1));
    }
    public static String getMiddle(String word){
       String middle ="";
        int length = word.length();
       if(length % 2 ==0) {
          middle= word.substring(length/2-1,length/2+1);
       }else{
           middle= word.substring(length/2,length/2+1);
       }
       return middle;
    }
}
