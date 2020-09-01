package com.crc.design.pattern.observer;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 17:04
 * @descripton: 观察者模式测试类
 */
public class ObserverTest {

    public static void main(String[] args) {

        Target target = new ConcreteTarget();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        target.addObserver(observer1);
        target.addObserver(observer2);
//        target.removeObserver(observer2);

        target.notifyObserver();
    }
}
