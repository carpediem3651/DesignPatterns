package com.designpatterns.designpatterns.strategy;

public class PayMoney implements PayMethod{

    @Override
    public String pay() {
        // TODO Auto-generated method stub
        return "현금으로 지급";
    }
    
}
