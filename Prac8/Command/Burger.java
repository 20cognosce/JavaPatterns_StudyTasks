package Prac8.Command;

public class Burger {
    private final String name;

    public Burger (String name) {
        this.name = name;
    }

    public void buy(Integer quantity){
        System.out.println("Burger [ Type: " + name + "; Quantity: " + quantity + " ] bought");
    }
    public void sell(Integer quantity){
        System.out.println("Burger [ Type: " + name + "; Quantity: " + quantity + " ] sold");
    }
}
