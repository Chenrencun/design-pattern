package com.crc.design.pattern.templateMethod;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 16:12
 * @descripton: 具体子类
 */
public class ConcreteClass extends AbstractClass{

    public void abstractMethod1() {
        System.out.println("执行具体子类的重写方法1");
    }

    public void abstractMethod2() {
        System.out.println("执行具体子类的重写方法2");
    }

    @Override
    public boolean hookMethod() {
        return false;
    }
}
