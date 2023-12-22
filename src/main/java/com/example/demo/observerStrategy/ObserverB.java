package com.example.demo.observerStrategy;

public class ObserverB implements Observe {
    @Override
    public void update(SubData data) {
        System.out.println("We already know something, and we now updating our state/data");
    }
}
