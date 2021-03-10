package TestPractice;

public class NestIf_Drinks {
    public static void main(String[] args) {
        int typeSelection = 2;
        int drinkSelection = 7;
        double price = 0;
        String drink = "none";

        if (typeSelection == 1) {
            System.out.println("Please choose: 1 = Iced tea; 2 = lemonade");
            if (drinkSelection == 1) {
                price = 3.2;
                drink = "Iced tea";
            } else if (drinkSelection == 2) {
                price = 3.5;
                drink = "lemonade";
            } else {
                System.out.println("Invalid col drink selection");
            }
        } else if (typeSelection == 2) {
            System.out.println("Please choose: 1 = tea; 2 = coffee");
            if (drinkSelection == 1) {
                price = 2;
                drink = "tea";
            } else if (drinkSelection == 2) {
                price = 4;
                drink = "coffee";
            } else {
                System.out.println("Invalid hot drink selection");
            }
        } else {
            System.out.println("Invalid Type selection");
        }

        if (drink.equals("none")) {
            System.out.println("Try again");
        } else {
            System.out.println("Total for " + drink + " is $ " + price);
        }


    }
}

