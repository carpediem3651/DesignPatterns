package com.designpatterns.designpatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.designpatterns.designpatterns.strategy.PayCard;
import com.designpatterns.designpatterns.strategy.PurchaseService;

public class StrategyTest {

    @Test
    public void strategyTest() {
        PurchaseService service = new PurchaseService();

        String result = service.pay(new PayCard());
        assertEquals("카드로 지급", result);
    }
}
