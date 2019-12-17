package com.sidd.javademo.application.collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ConcurrentMapExample {

    static Map<String, AtomicLong> orders = new ConcurrentHashMap<>();

    public static void main(String[] args) {

        orders.put("Bombay", new AtomicLong());
        orders.put("Beijing", new AtomicLong());
        orders.put("London", new AtomicLong());
        orders.put("new york", new AtomicLong());

        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(ConcurrentMapExample::processOrders);
        service.submit(ConcurrentMapExample::processOrders);

        try {
            service.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdown();
        System.out.println(orders);
    }

    private static void processOrders() {
        for (String city : orders.keySet()) {
            for (int i = 0; i < 100; i++) {
                orders.get(city).getAndIncrement();
            }
        }
    }
}
