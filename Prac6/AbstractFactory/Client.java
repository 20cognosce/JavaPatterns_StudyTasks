package Prac6.AbstractFactory;

import java.util.NoSuchElementException;

public class Client {
    public static void testAbstractFactory() {
        String factoryType = "Type 1";
        AbstractFactory factory;

        if (factoryType.equals("Type 1")) {
            factory = new ConcreteFactory1();
        } else if (factoryType.equals("Type 2")) {
            factory = new ConcreteFactory2();
        } else throw new NoSuchElementException("Factory specified does not exist");

        ProductA suit = factory.createProductA();
        ProductB trousers = factory.createProductB();

        suit.doSomething();
        trousers.doSomethingElse();
    }
}
