package com.crc.design.pattern.proxy.cgLibProxy;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 11:05
 * @descripton:
 */
public class ConcreteSubject implements Subject {

    public void request() {
        System.out.println("具体主题类的request方法");
    }
}
