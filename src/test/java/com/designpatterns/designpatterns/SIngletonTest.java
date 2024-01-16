package com.designpatterns.designpatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.designpatterns.designpatterns.singleton.PayCard;



public class SIngletonTest {
    @Test
    public void singletonTest() {
        PayCard card1 = PayCard.getInstance();
        PayCard card2 = PayCard.getInstance();

        assertEquals(card1, card2);
    }
}
