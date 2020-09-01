package com.crc.design.pattern.observer;

public interface Target {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
