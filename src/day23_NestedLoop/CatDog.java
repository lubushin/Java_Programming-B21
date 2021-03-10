package day23_NestedLoop;

public class CatDog {
    public static void main(String[] args) {
        String sentence = "dog dog Dog Dog Dog Dog cat Cat cAt Cat Cat";
        String temp = sentence.toLowerCase();
        int countDog = 0;
        String word = "dog";
        while (temp.contains(word)) {
            temp = temp.replaceFirst(word, "");
            countDog++;//count frequency one by one
        }
        System.out.println(countDog);

        int countCat = 0;
        word = "cat";
        while (temp.contains(word)) {
            temp = temp.replaceFirst(word, "");
            countCat++;
        }
        System.out.println(countCat);
    }
}
