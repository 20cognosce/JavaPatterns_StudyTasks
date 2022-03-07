package Prac6.FactoryMethod;

public class ConcreteCreatorA extends Creator {
    @Override
    Product createProduct() {
        return new ProductA();
    }
}
