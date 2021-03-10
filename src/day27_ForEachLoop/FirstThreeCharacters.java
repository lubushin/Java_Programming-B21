package day27_ForEachLoop;

public class FirstThreeCharacters {
    public static void main(String[] args) {

        String[] names = {"Subi", "Holed", "Aijamal", "Jaden", "Peter", "Daniel", "Sunat", "Gulya", "Lilya", "Roman"};

        for (String eachName : names){
            System.out.print(eachName.substring(0,3)+", ");


        }
    }
}
