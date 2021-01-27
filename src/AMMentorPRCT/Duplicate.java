package AMMentorPRCT;

public class Duplicate {
    public static void main(String[] args) {
        String str = "aabbcdejjzzz";
        String result = "";//'a2b2j2z3'

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int frequency = 0;

                for (int i = 0; i < str.length(); i++) {
                    char eachChar = str.charAt(i);
                    if (eachChar==ch) {
                        frequency++;
                        result+=""+ch;
                    }
                }
                if (frequency>1&& result.contains(""+ch)){// && result.contains(""+ch)
                  //+ch+
                    result+=""+frequency;
                }

            }
        System.out.println(result);


      /*char ch = str.charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

        }*/



        }

    }

