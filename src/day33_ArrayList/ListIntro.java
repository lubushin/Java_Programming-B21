package day33_ArrayList;
import java.util.ArrayList;
public class ListIntro {
    public static void main(String[] args) {
      ArrayList <Integer> scores = new ArrayList<>();//size:1
        scores.add(100);//auto boxing; index#:0;
        scores.add(90);//auto boxing; index#:1;
        scores.add(80);//auto boxing; index#:2;

        System.out.println(scores);
        System.out.println("===========================================");

ArrayList<String> groseryList = new ArrayList<>();//[Egg, water, milk,bread] Toilet paper, Sanitiser
groseryList.add("Egg");//3
groseryList.add("Water");//4
groseryList.add("Milk");//5
groseryList.add("Bread");//6
groseryList.add(0,"Toilet paper");//0
groseryList.add(1,"Sanitiser");//2
groseryList.add(1,"Masks");//1
        System.out.println(groseryList);


        System.out.println(groseryList);

        String item1 =  groseryList.get(2);

        System.out.println("item1 = " + item1);

        String item2 = groseryList.get(1);
        System.out.println("item2 = " + item2);

        //   System.out.println( groceryList.get(100)  );

        int total = groseryList.size();
        System.out.println("total = " + total);
        System.out.println(groseryList.get(groseryList.size()-1));






    }
}
