package Practice_12_09_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.customizeOreder("Small", 2, 2, 20);
        System.out.println(pizza1);

        System.out.println("==================================================");
        Pizza[] cybertekPizza = new Pizza[175];

        Pizza pizza = new Pizza();
        for(int i = 0; i<=cybertekPizza.length-1; i++){
        pizza.customizeOreder("Medium", 2, 2, 18);
        cybertekPizza[i] =pizza;
        }
         
        double total = 0;
        for(Pizza each : cybertekPizza){
            total+=each.totalPrice;

        }
        System.out.println("total = " + total);
        System.out.println("====================================================");
        /*
        medium: 2 cheeseT, 3 pepert
        large: 3 cheese; 4 Pep
        small: 1 cheese, 2 peppT
         */

        ArrayList<Pizza> pizzas = new ArrayList<>();
        for(int i =1; i<=60; i++) {
            Pizza medium = new Pizza();
            medium.customizeOreder("Medium", 2,3,18);

            Pizza large = new Pizza();
            large.customizeOreder("Large",3,4,18);

            Pizza small = new Pizza();
            small.customizeOreder("Small",1,2,18);
            pizzas.addAll(Arrays.asList(small, medium, large));


        }

        System.out.println("Number of pizzas: "+pizzas.size());
        double sum = 0;
        for(Pizza eachPizza : pizzas){
            sum+=eachPizza.totalPrice;
        }
        System.out.println(sum);


    }
}



