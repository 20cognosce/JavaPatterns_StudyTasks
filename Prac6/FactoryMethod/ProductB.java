package Prac6.FactoryMethod;

public class ProductB implements Product {
    @Override
    public void doSomething() {
        System.out.println("Factory method: product B created");
    }
}
