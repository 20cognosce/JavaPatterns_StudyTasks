package Prac8;

import Prac8.Iterator.*;
import Prac8.Command.*;

public class Main {
    public static void main(String[] args) {
        StudentsRepository studentsRepository = new StudentsRepository();
        Iterator iter = studentsRepository.getIterator();
        while (iter.hasNext()) {
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }

        OrderManager handler = new OrderManager(); //invoker

        Burger myBurger = new Burger("Big tasty"); //receiver
        BuyOperation buyBurger = new BuyOperation(myBurger, 10); //command
        handler.takeOrder(buyBurger);
        SellOperation sellBurger = new SellOperation(myBurger, 10); //command
        handler.takeOrder(sellBurger);

        handler.completeOrders();
    }
}
