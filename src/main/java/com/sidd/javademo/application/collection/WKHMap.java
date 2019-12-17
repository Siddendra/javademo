package com.sidd.javademo.application.collection;

import java.util.Map;
import java.util.WeakHashMap;

public class WKHMap {

    public static void main(String args[]) {
        Map<Order, Integer> orders = new WeakHashMap<>();
        orders.put(new Order(1001, "mobile"), 100); //Weak Reference, Object refernce is used here as a key
                                                                // in the map and we don't have any other reference.

        orders.put(new Order(1002, "lap"), 300); //Weak reference

        Order o3 = new Order(007, "Tab");

        orders.put(o3, 8900); //Strong reference

        System.out.println("Before GC :"+orders.size());
        System.gc(); //Garbage call

        System.out.println("After GC :"+orders.size());
    }
}

class Order{
    int orderId;
    String details;

    public Order(int id, String details) {
        this.orderId = id;
        this.details = details;
    }

}