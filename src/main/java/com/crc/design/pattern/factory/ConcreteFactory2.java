package com.crc.design.pattern.factory;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 9:25
 * @descripton:
 */
public class ConcreteFactory2 implements Factory{

    @Override
    public Product create() {
        System.out.println("具体工厂2生成—>具体产品2");
        return new ConcreteProduct2();
    }
}
