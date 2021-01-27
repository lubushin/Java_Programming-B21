package Practice_12_09_2020;

public class Pizza {

    public String size;
    public int cheeseToppings, pepperoniToppings;
    public double priceOfPizza, tips, totalPrice;

    public void customizeOreder(String size, int cheeseToppings, int pepperoniToppings, double tips){
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        priceOfPizza = calcCost();
       // tips = tips/100;//converting percentage to decimal
        this.tips = tips/100 * priceOfPizza;

        totalPrice = priceOfPizza+ this.tips + (priceOfPizza*0.08);
    }

    public double calcCost(){
        double startingPrice = (size.equalsIgnoreCase("small"))? 10
        : (size.equalsIgnoreCase("medium"))? 12 : 14;

        double cheese = 1* cheeseToppings;
        double pepperoni = 1.5 * pepperoniToppings;
        return startingPrice + cheese + pepperoni;

    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheeseToppings=" + cheeseToppings +
                ", pepperoniToppings=" + pepperoniToppings +
                ", priceOfPizza=" + priceOfPizza +
                ", tips=" + tips +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
/*
create a custom class for Pizza that should contain the following:
            variables:
                    size (either small, medium, large)
                    number of cheese topping
                    number of pepperoni topping
                    tips
            methods:
                    customizeOrder(): allows user to set the size and toppings of Pizza
                    calcCost(): returns the total cost  as double
                    toString(): get the full informationa nd total cost of Pizza
            Pizza cost is determined by:
                        Small: $10 + $1.5 per pepperoni topping + 1$ per cheese topping
                        Medium: $12 + $1.5 per pepperoni topping + 1$ per cheese topping
                        Large: $14 + $1.5 per pepperoni topping + 1$ per cheese topping
 */