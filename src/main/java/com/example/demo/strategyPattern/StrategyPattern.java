package com.example.demo.strategyPattern;

public class StrategyPattern {
    private Checkout checkout;

    public void applyingStrategy(Checkout checkout) {
        this.checkout = checkout;
    }

    public String checkout() {
        return checkout.checkout();
    }
}
