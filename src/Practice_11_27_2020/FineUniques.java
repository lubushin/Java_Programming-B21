package Practice_11_27_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class FineUniques {
    public static void main(String[] args) {
        String[] arr = {"A","B","C","D", "D","A"};
        String[] result = uniques(arr);

        System.out.println(Arrays.toString(result));
    }

    public static String[] uniques(String[] arr) {
        ArrayList<String> uniqueElementsList = new ArrayList<>();
        for (String element : arr) {
            int count = 0;
            for (String each : arr) {
                if (each.equals(element)) {
                    count++;
                }
            }
            if (count == 1) {
                uniqueElementsList.add(element);
            }
        }
        String[] uniques = new String[uniqueElementsList.size()];//converting ArrayList to Array
        for (int i = 0; i <= uniques.length - 1; i++) {
            uniques[i] = uniqueElementsList.get(i);
            //each element of the array list need to be assign to each index

        }
        return uniques;
    }

}




