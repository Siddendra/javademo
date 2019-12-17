package com.sidd.javademo.application.designpattern.strategy;

public class ShoppingCartTest {

    public static void main(String args[]) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("123",10);
        Item item2 = new Item("324",20);
        Item item3 = new Item("4576",30);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.pay(new CreditCardStrategy("Siddendra",
                "4111111111111111", "786","12/22"));

        cart.pay(new PaypalStrategy("sid@gmail.com", "abc"));
    }
}
