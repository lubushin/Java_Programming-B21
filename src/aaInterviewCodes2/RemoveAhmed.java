package aaInterviewCodes2;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed {
    public static void main(String[] args) {

    ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "Peter", "John", "Ahmed", "Eric"));
    names.removeAll(Arrays.asList("Ahmed"));
        System.out.println(names);

    }
}
