package Prac8.Command;

public class BuyOperation implements Order {
    private final Burger burgerType;
    private final Integer quantity;

    public BuyOperation(Burger burger, Integer quantity){
        this.burgerType = burger;
        this.quantity = quantity;
    }

    public void execute() {
        burgerType.buy(quantity);
    }
}
