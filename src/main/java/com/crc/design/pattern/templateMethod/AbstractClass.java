package com.crc.design.pattern.templateMethod;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 16:06
 * @descripton: 抽象类
 */
public abstract class AbstractClass {

    // 模板方法
    public void templateMethod(){
        concreteMethod();
        abstractMethod1();
        // 钩子方法进行逻辑判断
        if (hookMethod()){
            abstractMethod2();
        }
    }

    // 具体方法（基本方法）
    public void concreteMethod(){
        System.out.println("执行具体方法");
    }

    // 抽象方法（基本方法）
    public abstract void abstractMethod1();

    // 抽象方法（基本方法）
    public abstract void abstractMethod2();

    // 钩子方法（基本方法）
    public boolean hookMethod(){
        return true;
    }
}
