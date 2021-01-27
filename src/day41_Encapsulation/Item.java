package day41_Encapsulation;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return quantity * unitPrice;
    }

    public String toString() {
        return "Item{" +
                "name=' " + name + '\'' +
                ", unitPrice= $" + unitPrice +
                ", quantity=" + quantity +
                ", total price $"+calcCost()+
                '}';
    }
}
/*
 create a class called Item
            instance variables:
                name, unitPrice, quantity
            add a constructor that can initialize the fields
            instance methods:
                calcCost(): returns the total cost as double
                            hint: totalCost = quantity * unitPrice
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

 */