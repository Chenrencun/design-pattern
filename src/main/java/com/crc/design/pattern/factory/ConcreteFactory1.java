package com.crc.design.pattern.factory;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 9:24
 * @descripton:
 */
public class ConcreteFactory1 implements Factory{

    @Override
    public Product create() {
        System.out.println("具体工厂1生成—>具体产品1");
        return new ConcreteProduct1();
    }
}
