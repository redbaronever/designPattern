package com.example.demo.strategyPattern;

public class OnlineCheckout implements Checkout {
    @Override
    public String checkout() {
        return "Online checkout";
    }
}
