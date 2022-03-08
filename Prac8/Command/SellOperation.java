package Prac8.Command;

public class SellOperation implements Order {
    private final Burger burgerType;
    private final Integer quantity;

    public SellOperation(Burger burger, Integer quantity){
        this.burgerType = burger;
        this.quantity = quantity;
    }

    public void execute() {
        burgerType.sell(quantity);
    }
}