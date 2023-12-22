package com.example.demo.observerStrategy;

public class ObserverA implements Observe {
    @Override
    public void update(SubData data) {
        System.out.println("I already do something and now im gonna update my internal state/data");
    }
}
