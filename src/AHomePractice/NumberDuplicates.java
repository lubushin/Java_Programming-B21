package AHomePractice;

public class NumberDuplicates {
    public static void main(String[] args) {
        String str = "aabbcdejjzz";
        String result = "";  //

        for( int i = 0; i <= str.length()-1; i++  ){
            if(!result.contains( ""+str.charAt(i) )){
                result += str.charAt(i);

            }

        }

        System.out.println(result);
    }

    }

/*
 //Removes teh duplicates from teh string and returns it
    public static String removeDuplicates(String str){
        String result = "";  //"abc"

        for( int i = 0; i <= str.length()-1; i++  ){
            if(!result.contains( ""+str.charAt(i) )){
                result += str.charAt(i);
            }
        }

        return result;
    }

    //Returns the frequency of characters
    public static String frequencyOfCharacters (String str){
        String result = ""; //a3b4c2

        String nonDup = StringUtility.removeDuplicates(str);//a b c

        for (int i = 0; i <= nonDup.length() - 1; i++) {
            char ch = nonDup.charAt(i);//a
            int count = StringUtility.frequency(str, ch);  //3 4 2
            result += "" + ch + count;
        }
        return result;
    }


    }

        public static String frequencyOfCharacters (String str){
            String result = ""; //a3b4c2

            String nonDup = StringUtility.removeDuplicates(str);//a b c

            for (int i = 0; i <= nonDup.length() - 1; i++) {
                char ch = nonDup.charAt(i);//a
                int count = StringUtility.frequency(str, ch);  //3 4 2
                result += "" + ch + count;
            }
            return result;
        }
 */