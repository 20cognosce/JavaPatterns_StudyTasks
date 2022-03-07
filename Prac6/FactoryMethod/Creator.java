package Prac6.FactoryMethod;

public abstract class Creator {
    public void doStuff() {
        Product currentProduct = createProduct();
        currentProduct.doSomething();
    }
    abstract Product createProduct();
}
