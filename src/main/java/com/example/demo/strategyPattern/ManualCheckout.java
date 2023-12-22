package com.example.demo.strategyPattern;

public class ManualCheckout implements Checkout {
    @Override
    public String checkout() {
        return "Manual checkout";
    }
}
