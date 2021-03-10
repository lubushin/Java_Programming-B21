package day22_JavaRecap;

public class FruquencyOfSingleChar {
    public static void main(String[] args) {
        String str = "I like to learn java, I would love to join Cybertek";
        char ch = ' ';
        int count = 0;
      for(int i = 0; i <= str.length()-1;i++){
          char eachChar = str.charAt(i);//repesent each character from string

          if(ch == eachChar){
              count++;

          }
      }
        System.out.println("Count: "+count);
        System.out.println("Number words: "+(count+1));

        /*
         for(int i = 0; i<= str.length()-1; i++){
            String eachCharacter = ""+str.charAt(i);
         */

    }
}
