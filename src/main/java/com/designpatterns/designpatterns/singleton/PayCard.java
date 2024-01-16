package com.designpatterns.designpatterns.singleton;

public class PayCard {

    private static PayCard instance = new PayCard();

    private PayCard() {

    }

    public static PayCard getInstance() {
        return instance;
    }

    public String pay() {
        return "card";
    }

    public String payedAmount() {
        return "amount";
    }
}
