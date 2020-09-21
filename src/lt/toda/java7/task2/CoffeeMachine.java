package lt.toda.java7.task2;

public class CoffeeMachine {
    private final String manufacturer;
    private final String model;
    private final double power;
    private Coffee coffee;
    private Owner owner;

    public CoffeeMachine(String manufacturer, String model, double power) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.power = power;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner.getName();
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public String buy(Coffee coffee) {
        return coffee.buy();
    }

    @Override
    public String toString() {
        return String.format("%s \"%s\" %.2fkW", manufacturer, model, power);

    }
}
