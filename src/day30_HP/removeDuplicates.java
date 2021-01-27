package day30_HP;

public class removeDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates("aabbgghhhtv");

    }

    public static void RemoveDuplicates(String str) {
        String result = "";

        for (char each : str.toCharArray()) {
            if (!result.contains("" + each)) {
                result += each;
            }
        }

  /*for(int i = 0; i<=str.length()-1;i++){
      if(!result.contains("" + str.charAt(i))){
        result+=str.charAt(i);
      }
  }*/
            System.out.println(result);
        }
    }


