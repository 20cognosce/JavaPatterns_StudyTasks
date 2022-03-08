package Prac8.Command;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private final List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void completeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
