package com.crc.design.pattern.observer;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 16:55
 * @descripton: 具体观察者类1
 */
public class ConcreteObserver1 implements Observer{

    public void responseMethod() {
        System.out.println("执行具体观察者1的方法");
    }
}
