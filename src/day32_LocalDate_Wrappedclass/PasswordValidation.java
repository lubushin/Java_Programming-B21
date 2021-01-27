package day32_LocalDate_Wrappedclass;

import library.StringUtility;

public class PasswordValidation {
    public static void main(String[] args) {
        /*
        1. 8 characters at least
        2. there are must be  digit;      //  isUpper          isLower
        3. there must be a letter(at least one upper case &o ne lower case)
        4. there must be a special character
         */

 String password = "Password#7";
 boolean atLeast8Char = password.length()>=8;
 boolean hasUpperCase = false;
 boolean hasLowerCase = false;
 boolean hasDigis = false;
 boolean hasSpecialChar = false;

 for(int i =0; i<=password.length()-1;i++){
     char each = password.charAt(i);//reading each character of password
     if(Character.isUpperCase(each)){
         hasUpperCase=true;
     } else if(Character.isLowerCase(each)){
         hasUpperCase=true;
     }else if(Character.isDigit(each)){
        hasDigis = true;
     }else {
         hasSpecialChar = true;
     }
 }

 boolean isValid = atLeast8Char && hasUpperCase && hasLowerCase && hasDigis && hasSpecialChar;
        System.out.println(isValid);

        System.out.println("======================================================================");
/* String upperCaseLetters = "";
 String lowerCaseLetters = "";
 String digits = "";
 String specialChar = "";

 for(char each : password.toCharArray()){
     if(Character.isUpperCase(each)){
         upperCaseLetters+= each;
     }else if(Character.isLowerCase(each)){

         lowerCaseLetters+=each;
     }else if(Character.isDigit(each)){
         digits+=each;
     }else {
         specialChar+=each;
     }
     }
        System.out.println("upper case = "+upperCaseLetters);
        System.out.println("lower case = "+lowerCaseLetters);
        System.out.println("digits = "+digits);
        System.out.println("specialChar = " + specialChar);

        boolean isValid = password.length()>=8 && upperCaseLetters.length()>0 && lowerCaseLetters.length()>0
                && digits.length()>0 && specialChar.length()>0;
        System.out.println(isValid);*/
        }


    }

