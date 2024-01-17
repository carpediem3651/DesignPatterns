package com.designpatterns.designpatterns.proxy;

public class UserAuth implements Aspect{

    @Override
    public void before() {
        // TODO Auto-generated method stub
        System.out.println("당신의 권한은....");
    }

    @Override
    public void after() {
        // TODO Auto-generated method stub
    }

}
