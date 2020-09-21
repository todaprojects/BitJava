package lt.toda.java7.task2;

public class Coffee {
    private final String coffeeType;
    private final int amount;
    private final double price;

    public Coffee(String coffeeType, int amount, double price) {
        this.coffeeType = coffeeType;
        this.amount = amount;
        this.price = price;
    }

    public String buy() {
        return String.format("A %dml cup of \"%s\" coffee has been bought for %.2f€.\n", this.amount, this.coffeeType, this.price);
    }
}

class Cappuccino extends Coffee {
    public Cappuccino() {
        super("Cappuccino", 200, 1.49);
    }
}

class Espresso extends Coffee {
    public Espresso() {
        super("Espresso", 150, 1.99);
    }
}

class Latte extends Coffee {
    public Latte() {
        super("Latte", 150, 2.49);
    }
}
