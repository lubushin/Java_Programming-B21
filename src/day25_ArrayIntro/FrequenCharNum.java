package day25_ArrayIntro;

public class FrequenCharNum {
    public static void main(String[] args) {
        /*String str = "ababcaa";
        String result = "";

            char ch = str.charAt(0);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                char eachChar = str.charAt(i);
                if (eachChar == ch) {
                    count++;
                }
            }
            System.out.println(count);*/

        String str = "aabbcccdkllllmmmmm";
        String result ="";
        for(int j=0; j<str.length();j++){
            char ch = str.charAt(j);
            int count = 0;
            for(int i = 0;i<str.length();i++){
                char eachChar = str.charAt(i);
                if(ch==eachChar){
                    count++;
                }

            }

            System.out.println(result+=count);
        }

        }

    }


        /*
write a program that can find the frequency of each characters from a string
            str = "ababcaa";
                    // nonDup =  "abc"  a b c
                      //     frequency: 4 2 1
            output:
                a4b2c1
         */


