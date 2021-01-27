package day41_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(
             new Item("sanitazer", 2.5,2),
                new Item("mask",5, 2),
                new Item("paper", 15,4)

        ));
        System.out.println(items);
        double total = 0;
        for(Item eachItem :items){
            total+=eachItem.calcCost();
        }

        System.out.println(total);

    }
}
/*
 create a class called ShoppingList
            create 5 objects of Item and store them into ArrayList of Items

            calculate the total cost of all Items in the list

 */