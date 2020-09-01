package com.crc.design.pattern.factory;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 9:23
 * @descripton: 具体产品1
 */
public class ConcreteProduct1 implements Product{

    @Override
    public void show() {
        System.out.println("具体产品1显示------");
    }
}
