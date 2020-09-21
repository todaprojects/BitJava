package lt.toda.java7.task2;

public class Main {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine("Bosch", "C-230", 2.3);

        coffeeMachine.setOwner(new Owner("OwnerName"));
        System.out.printf("Owner of coffee machine %s is: %s\n", coffeeMachine.toString(), coffeeMachine.getOwner());

        System.out.printf("Method 1st call from a CoffeeMachine instance: %s", coffeeMachine.buy(new Cappuccino()));

        coffeeMachine.setCoffee(new Cappuccino());
        System.out.printf("Method 2nd call from a CoffeeMachine instance: %s", coffeeMachine.getCoffee().buy());

        //another instance
        Coffee coffee = new Espresso();
        System.out.printf("Method call from a Coffee instance: %s", coffee.buy());

        //another instance
        Latte latte = new Latte();
        System.out.printf("Method call from a Latte instance: %s", latte.buy());

        //another instance
        Coffee black = new Coffee("Black", 100, 3.99);
        System.out.printf("Method call from a Black instance: %s", black.buy());
    }
}
