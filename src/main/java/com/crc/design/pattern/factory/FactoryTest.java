package com.crc.design.pattern.factory;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 9:28
 * @descripton: 工厂方法模式测试类
 */
public class FactoryTest {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory1();
        Product product1 = factory.create();
        product1.show();

        factory = new ConcreteFactory2();
        Product product2 = factory.create();
        product2.show();
    }
}
