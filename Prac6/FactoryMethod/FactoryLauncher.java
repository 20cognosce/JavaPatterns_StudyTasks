package Prac6.FactoryMethod;

import java.util.NoSuchElementException;

//Удобен для масштабирования в ширину - увеличения числа продуктов
public class FactoryLauncher {
    public static void testFactoryMethod() {
        String productName = "Product B";
        Creator factory;

        if (productName.equals("Product A")) {
            factory = new ConcreteCreatorA();
        } else if (productName.equals("Product B")) {
            factory = new ConcreteCreatorB();
        } else throw new NoSuchElementException("Product specified does not exist");

        factory.doStuff();
    }
}
