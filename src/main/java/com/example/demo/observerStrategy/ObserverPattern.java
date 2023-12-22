package com.example.demo.observerStrategy;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern implements Subject {
    private SubData data;
    private List<Observe> observeList;
    public ObserverPattern(SubData data) {
        this.data = data;
    }
    @Override
    public void attach(Observe item) {
        if (CollectionUtils.isEmpty(observeList)) {
            observeList = new ArrayList<>();
        }
        if (!observeList.contains(item)) {
            observeList.add(item);
        }
    }
    @Override
    public void detach(Observe item) {
        if (!CollectionUtils.isEmpty(observeList) && observeList.contains(item)) {
            observeList.remove(item);
        }
    }
    @Override
    public void alertAll() {
        for (Observe item : observeList) {
            item.update(data);
        }
    }
    public void aSpecialAction(String status) {
        data.setStatus(status);
        alertAll();
    }
}
