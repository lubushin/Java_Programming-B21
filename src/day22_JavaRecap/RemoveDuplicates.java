package day22_JavaRecap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AAABBBBBCCCCCCCDDFeeejjjppp";//A,B,B,C,c - skip duplicates
        String result = "";//"ABCDF"

        for(int i = 0; i<= str.length()-1; i++){
            String eachCharacter = ""+str.charAt(i);//gets each character one by one

           if(result.contains(eachCharacter)){
               continue;//Skip
            }else{//if the character of str is snot contained in the result yet
                //then we concate the character
               result+=eachCharacter;
            }
            /*if(!result.contains(eachCharacter))*/
           result += eachCharacter;
            }
        System.out.println("Result: "+result);


        }

    }

