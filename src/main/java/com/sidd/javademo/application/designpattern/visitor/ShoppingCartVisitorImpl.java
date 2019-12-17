package com.sidd.javademo.application.designpattern.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public int visit(Book book) {
        int cost = 0;
        //apply 5$ discount if book price is grater than 50$.
        if(book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else {
            cost = book.getPrice();
        }
        System.out.println("Book ISBN :: "+book.getIsbnNumber()+ "Cost: "+cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + "Cost :"+ cost);
        return cost;
    }

}
