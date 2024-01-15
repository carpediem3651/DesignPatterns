package com.designpatterns.designpatterns.strategy;

public class PurchaseService {
    
    public String pay(PayMethod payMethod) {
        String result = payMethod.pay();

        return result;
    }
}
