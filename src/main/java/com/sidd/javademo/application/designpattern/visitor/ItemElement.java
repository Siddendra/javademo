package com.sidd.javademo.application.designpattern.visitor;

public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);
}
