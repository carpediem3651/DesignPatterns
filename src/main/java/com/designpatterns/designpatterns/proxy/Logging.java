package com.designpatterns.designpatterns.proxy;

public class Logging implements Aspect {

    @Override
    public void before() {
        System.out.println("Logging start...." + System.nanoTime());
    }

    @Override
    public void after() {
        System.out.println("Logging end ...." + System.nanoTime());
    }
    
}
