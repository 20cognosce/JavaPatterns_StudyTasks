package Prac6.FactoryMethod;

public class ConcreteCreatorB extends Creator {
    @Override
    Product createProduct() {
        return new ProductB();
    }
}
