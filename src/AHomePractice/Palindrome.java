package AHomePractice;

public class Palindrome {
    public static void main(String[] args) {
       /* String word = "racecar";
        String result = "";
        for(int i = word.length()-1; i>=0;i--){
            result+=word.charAt(i); //short hand operator
        }
       if(word.equalsIgnoreCase(result)){
        System.out.println("palindrome");
       }else{
         System.out.println("not palindrome");
   }*/

        System.out.println("=======================================");

       String word1 = "aabccd";//bd
       String result1 = "";
        int frequency = 0;
       for(int i =0; i<word1.length(); i++){

           String uniqueLetter = word1.charAt(i)+"";


           for(int j = 0; j<word1.length();j++){
               String eachLetter = word1.charAt(j)+" ";
               if(uniqueLetter.equalsIgnoreCase(eachLetter)){
                   frequency++;
               }
               }

           if(frequency == 1){
             result1+=uniqueLetter;

           }
           System.out.println(result1);
       }



    }
}
/*
            char ch = str.charAt(0);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char eachChar = str.charAt(i);
                if (eachChar == ch) {
                    count++;
                }
            }



 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "AABCCDEFFGGHJ";

        for(int index = 0;index< str.length(); index++){//index<=str.length()-1
          //purpose of the loop is to iterate through the character one at the time
        int frequency = 0;//resetting the value each iteration of the out loop(first loop)
        //charAt(index) --> A//index=0--> A
            // other --> AABCCD
            for(int inner = 0; inner<str.length();inner++){
                //charAt(inner)--> A A B C C D
                //0->A
                //1->A
                //2->B
                if(str.charAt(index)==str.charAt(inner)){
                    frequency++;
                  //compararing A==A-->freq = 1
                  // comp       A==A-->freq = 2
                  //            A==B-->freq = 1

                }
            }
            if(frequency==1){
                System.out.print(str.charAt(index));
            }

        }

 */