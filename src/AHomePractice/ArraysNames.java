package AHomePractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysNames {
    public static void main(String[] args) {
        ArrayList<String> n = new ArrayList<>();
        n.add("Lena");
        n.add("Mira");
        n.addAll(Arrays.asList("Nora", "Daniel","Dora","Ben","Mike","Ken", "Monic"));

        System.out.println(n);
        System.out.println("================================");

        for( int i =0; i<n.size();i++){
            if(n.get(i).startsWith("M")){
            n.remove(i);
          }
            if(i==n.size()-1)  {
                break;
            }
        }
         System.out.println(n);
        System.out.println("============================================");
         n.removeIf(p-> !p.startsWith("D"));
        System.out.println(n);

    System.out.println("=================================================");
    ArrayList<Integer> numList = new ArrayList<>();
    numList.addAll(Arrays.asList(1,2,3,4,5,10,20,30,40,50));
    numList.removeIf(p-> p%2!=0);
        System.out.println(numList);


    }
}
