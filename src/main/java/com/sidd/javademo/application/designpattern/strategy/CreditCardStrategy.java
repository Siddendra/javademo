package com.sidd.javademo.application.designpattern.strategy;

public class CreditCardStrategy implements PaymentStrategy{

    private String name;
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String expiryDate) {
        this.name = name;
        this.cardNumber =cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }


    @Override
    public void pay(int amount) {

        System.out.println("Amount Paid with Credit/Debit Card.");
    }
}
