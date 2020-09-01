package com.crc.design.pattern.abstractFactory;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 10:21
 * @descripton: 抽象工厂模式测试类
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory1();
        FirstProduct firstProduct11 = factory.createFirstProduct();
        SecondProduct secondProduct21 = factory.createSecondProduct();

        firstProduct11.show();
        secondProduct21.show();
    }
}
