package Practice_11_11_20;

public class ArraysPractice2 {
    public static void main(String[] args) {
        //How many words where first and last char are matching
        String[] word = {"Anna", "level", "Lol","Donald", "Biden", "Aamir","Mariam","Agalar", "Engin" };

        int count =0;
        for(String each : word) {
            char firstChar = each.toLowerCase().charAt(0);//a
          char lastChar = each.toLowerCase().charAt(each.length()-1);//a

        if(firstChar == lastChar){
            count++;
        }

        }
        System.out.println(count);

        }
    }
