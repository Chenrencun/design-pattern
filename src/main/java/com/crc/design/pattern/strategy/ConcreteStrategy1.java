package com.crc.design.pattern.strategy;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 16:27
 * @descripton: 具体策略类1
 */
public class ConcreteStrategy1 implements Strategy{

    public void strategyMethod() {
        System.out.println("访问具体策略类1的算法");
    }
}
