package day26_Arrays;



public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {"C#", "Java", "C#", "Python", "Python", "Ruby", "Swift", "C++", "Swift"};
        String result = "";
        for(int j = 0;j<words.length;j++) {
            int count = 0;
            String uniq = words[j];
            for (int i = 0; i < words.length; i++) {
                String eachWord = words[i];
                if (eachWord == uniq) {
                    count++;
                }
            }
                if(count == 1){
                    result+=uniq +",";
                }
            }
        System.out.println(result);
        System.out.println("============================================");
            //longest words
            //output; strawberry, programmin
            String[] word = {"Monday", "Blueberry", "Banana", "Strawberry", "Apple", "Programmin"};//char use
        String longest = "";

        for(int i = 0;i<word.length; i++){
            String temp = word[i];
                if(temp.length()> longest.length()){
                    longest=""+temp;

                }
            }
        System.out.println(longest);




        }
    }
