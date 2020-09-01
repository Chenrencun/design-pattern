package com.crc.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 17:01
 * @descripton:
 */
public class ConcreteTarget implements Target{

    private List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer:observerList
             ) {
            observer.responseMethod();
        }
    }
}
