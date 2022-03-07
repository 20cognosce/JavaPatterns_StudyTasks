package Prac6.FactoryMethod;

public class ProductA implements Product {
    @Override
    public void doSomething() {
        System.out.println("Factory method: product A created");
    }
}
