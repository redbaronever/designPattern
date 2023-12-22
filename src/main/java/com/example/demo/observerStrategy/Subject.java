package com.example.demo.observerStrategy;

public interface Subject {
    void attach(Observe item);

    void detach(Observe item);

    void alertAll();
}
