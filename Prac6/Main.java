package Prac6;

import Prac6.FactoryMethod.FactoryLauncher;
import Prac6.AbstractFactory.Client;
import Prac6.Builder.*;
import Prac6.Prototype.*;

public class Main {
    public static void main(String[] args) {
        FactoryLauncher.testFactoryMethod();

        Client.testAbstractFactory();

        WindowBuilderDirector modernWindowDirector = new WindowBuilderDirector(new ModernWindowBuilder());
        WindowBuilderDirector classicWindowDirector = new WindowBuilderDirector(new ClassicWindowBuilder());
        System.out.println(classicWindowDirector.constructWindow().toString());
        System.out.println(modernWindowDirector.constructWindow().toString());

        TreeCache.loadCache();
        Tree clonedOak = TreeCache.getTree("Oak");
        System.out.println("Tree: " + clonedOak.getType());
        Tree clonedPine = TreeCache.getTree("Pine");
        System.out.println("Tree: " + clonedPine.getType());
    }
}
