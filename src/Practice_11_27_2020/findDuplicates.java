package Practice_11_27_2020;

import java.util.ArrayList;

public class findDuplicates {
    public static void main(String[] args) {

        char[] chars = {'A', 'A', 'B', 'C', 'C', 'D', 'A'};//[A,A,C,C]

        ArrayList<Character> duplicatedElementslist = new ArrayList<>();

        for (int i = 0; i <= chars.length - 1; i++) {
            int count = 0;
            for (char each : chars) {//respomsinble to finding frequency of one element at time
                if (each == chars[i]) {
                    count++;
                }
            }

            if (count > 1 && !duplicatedElementslist.contains(chars[i])) {//responsible to verify if the element is duplicated
                duplicatedElementslist.add(chars[i]);
            }
        }
        System.out.println(duplicatedElementslist);
    }
}

