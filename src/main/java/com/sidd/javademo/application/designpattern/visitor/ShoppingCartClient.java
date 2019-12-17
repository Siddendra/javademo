package com.sidd.javademo.application.designpattern.visitor;

public class ShoppingCartClient {

    public static void main(String args[]) {
        ItemElement [] items = new ItemElement[] {
          new Book(20, "1234"), new Book(100, "3456"),
          new Fruit(10, 2, "Banana"), new Fruit(100, 5, "Apple")
        };
         int total = calculate(items);
         System.out.println("Total Cost: "+total);
    }

    private static int calculate(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum =0;
        for(ItemElement item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
