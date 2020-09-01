package com.crc.design.pattern.abstractFactory;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 10:06
 * @descripton: 具体工厂类1
 */
public class ConcreteFactory1 implements Factory{

    public FirstProduct createFirstProduct() {
        return new ConcreteFirstProduct1();
    }

    public SecondProduct createSecondProduct() {
        return new ConcreteSecondProduct1();
    }
}
